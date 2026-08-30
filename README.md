# Python Compiler — Flask/Jinja2 to Static HTML

A hand-written compiler that parses Python source, runs semantic analysis, extracts runtime
context, and renders Flask/Jinja2 templates into static HTML. It also ships a built-in web
server that serves the generated pages and exposes a **generic CRUD API** for editing any
collection of data from the browser — not just `products`.

## What it does

1. **Lex & parse** Python with ANTLR 4.13.2 (`src/antlr/python/`).
2. **Build a hand-crafted AST** (`src/ast/`, 105 node classes) using 32 specialised
   visitors (`src/visitor/{python,html,css,jinja}/`), populating the scoped symbol table
   in the same pass.
3. **Run semantic analysis** (`src/semantic/`). Seven core rules
   (`TypeRule`, `UndefinedVariableRule`, `UndefinedFunctionRule`, `NotIterableRule`,
   `DuplicateFunctionRule`, `DuplicateArgumentRule`, `ReturnOutsideFunctionRule`, aided by
   `FunctionScopeAware`) raise
   eight named exceptions (`ScopeError` and `UndefinedVariableError` both come from
   `UndefinedVariableRule`); the ninth, `MissingFlaskVariableError`, is raised by
   `semantic/jinja/FlaskTemplateChecker` when a template variable is never passed to
   `render_template`. In single-file mode the HTML template AST is additionally checked by
   `semantic/jinja/JinjaSemanticAnalyzer` for undefined Jinja names. The CLI reports each as
   `Semantic error detected "TypeName": …`. `samples/` has 10 folders — one per error type (9)
   plus `CombinedErrors/`, a single file that triggers several errors at once.
4. **Extract context + render**: `ContextExtractor` gathers route data and context variables;
   `JinjaRenderer` renders each template to static HTML; `OutputWriter` writes the result into
   `output/` plus reports into `compiler_output/`.
5. **Serve (optional)**: `ProjectWatcher` recompiles on any source change and
   `CompilerWebServer` serves the pages with a same-origin CRUD API and SSE events.
6. **Visualise (optional)**: every parsed file opens a shared tree window —
   see *Parse-tree viewer* below.

## Build

```powershell
$javaFiles = Get-ChildItem -Path .\src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac --add-modules jdk.httpserver -encoding UTF-8 -cp ".\dependencies\antlr-4.13.2-complete.jar" -d .\build $javaFiles
```

## Run

Compile a single Python file (prints AST + semantic report):

```powershell
java "-Djava.awt.headless=true" --add-modules jdk.httpserver `
  -cp ".\build;.\dependencies\antlr-4.13.2-complete.jar" app.App samples\TypeError\type_error.py
```

Process a Flask project (parses, checks semantics, renders all templates to `output/`):

```powershell
java "-Djava.awt.headless=true" --add-modules jdk.httpserver `
  -cp ".\build;.\dependencies\antlr-4.13.2-complete.jar" app.App flask_project
```

Serve a Flask project live (web server + file watcher on port 8080):

```powershell
java "-Djava.awt.headless=true" --add-modules jdk.httpserver `
  -cp ".\build;.\dependencies\antlr-4.13.2-complete.jar" app.App flask_project --serve
```

## Parse-tree viewer

Every parsed file (Python, HTML template, CSS) opens a single shared Swing window
(`src/gui/ParseTreeViewer.java`) instead of many pop-ups. The window has:

- a **sidebar** listing every file/template parsed so far, de-duplicated by title;
- a **tree view** per entry showing the ANTLR CST / AST hierarchy;
- **zoom** controls to expand/collapse large trees.

Useful for debugging grammar rules and visitor output. Needs a desktop (not `--serve` alone) —
in headless runs the trees are simply not shown.

## Web server & CRUD API

Mode `--serve [port]` starts an HTTP server on `http://127.0.0.1:<port>`.

**Editable collections** are discovered from the compiled context: any top-level variable
whose value is a **list of dictionaries that each have a numeric `"id"`** (e.g. `products`,
`posts`, `books`). Every such collection gets `/api/<collection>`:

| Endpoint                      | Method   | Action                                            |
| ----------------------------- | -------- | ------------------------------------------------- |
| `/api/<collection>`           | `GET`    | List all records (JSON, types preserved)          |
| `/api/<collection>`           | `POST`   | Create a record, id = max + 1 → `201`             |
| `/api/<collection>/<id>`      | `GET`    | Fetch one record                                  |
| `/api/<collection>/<id>`      | `PUT`    | Update fields from the form → `200`               |
| `/api/<collection>/<id>`      | `DELETE` | Remove a record → `204`                           |

- **Runtime data model.** CRUD **never edits `app.py`**. Every mutation is persisted to a
  sidecar JSON file at `<project>/data/<collection>.json` containing `records` plus a `deleted`
  tombstone list. Reads merge the sidecar over the literal **by id**: the JSON version wins per
  id, records that exist only in the literal are kept, and tombstoned ids stay hidden (so UI
  deletions are not resurrected by the seed).
- After every write the templates are re-rendered (`CompilationSnapshot.rerender`) with a
  **merged live context** so multi-collection templates stay consistent.
- The sidecars are wiped at **program start** and on **any source change** (a fresh-run model):
  the app always boots from `app.py`'s literal, and UI edits live for the current session only.
  `PythonDataStore.absorbDataIntoSource` is kept as a manual "bake runtime data into the
  literal" utility — nothing invokes it automatically.
- `app.py` is therefore **read-only** for the whole program lifecycle; only the user edits it.
- Numbers are native JSON numbers (integers stay integers), booleans `true/false`, strings quoted.
- Non-list context (plain dicts, string lists, scalars) is read-only — no endpoint.
- Errors are JSON: `400` (bad request/data), `404` (missing), `405` (wrong method), `500` (others).
- `/events` is a Server-Sent-Events stream pushing `regenerated` / `compiler-error` events.
- `/` serves the rendered pages and `/static/**` serves project support files, same origin — no CORS.

## Project structure

```
src/
  app/                    # Entry point, web server, watcher, snapshot, runtime data store
  gui/                    # ParseTreeViewer: shared tree-window for parsed files
  antlr/                  # ANTLR-generated lexers/parsers (python/, html/, css/)
  visitor/                # 32 CST → AST visitors (python/, html/, css/, jinja/)
  ast/                    # 105 hand-written AST node classes
  semantic/               # 8 rules + helper, named errors, jinja template checkers
  symbolTable/            # Scoped symbol table
  generator/              # ContextExtractor, JinjaRenderer, OutputWriter
grammars/                 # Python/Html/Css ANTLR grammars
samples/                  # 10 folders: one per error type + CombinedErrors
docs/                     # architecture.html (EN) + architecture.ar.html (AR, RTL)
dependencies/             # antlr-4.13.2-complete.jar
```

At runtime, an editable collection additionally produces `data/<collection>.json`
(see *Web server & CRUD API* above) — that folder is regenerated per session and
should not be committed.

## Contributors

| Member   | Work                                                                                      |
| -------- | ----------------------------------------------------------------------------------------- |
| **Yasmeen** | Semantic analysis — undefined variables, scope errors, not-iterable checks, and missing Flask template variable detection; `ContextExtractor` |
| **Ruba**  | `ProjectWatcher` auto-regeneration & HTML fix-ups; `App` / `CompilationSnapshot`          |
| **Razan** | Jinja AST & visitors + code generation                                                    |
| **Rama**  | Undefined function rule, CSS code generation, and error test samples                      |
| **Yousef**| Generic CRUD web server and main branch integration/build                                 |

## Documentation

- `docs/architecture.html` — full engine architecture and workflow (English).
- `docs/architecture.ar.html` — the same document in Arabic with RTL formatting.