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
   `DuplicateFunctionRule`, `DuplicateArgumentRule`, `ReturnOutsideFunctionRule`) raise
   eight named exceptions (`ScopeError` and `UndefinedVariableError` both come from
   `UndefinedVariableRule`); the ninth, `MissingFlaskVariableError`, is raised by
   `semantic/jinja/FlaskTemplateChecker` when a template variable is never passed to
   `render_template`. The CLI reports each as
   `Semantic error detected "TypeName": …`. `samples/` has 10 folders — one per error type (9)
   plus `CombinedErrors/`, a single file that triggers several errors at once.
4. **Extract context + render**: `ContextExtractor` gathers route data and context variables;
   `JinjaRenderer` renders each template to static HTML; `OutputWriter` writes the result into
   `output/` plus reports into `compiler_output/`.
5. **Serve (optional)**: `ProjectWatcher` recompiles on any source change and
   `CompilerWebServer` serves the pages with a same-origin CRUD API and SSE events.

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

- `app.py` is the single source of truth. Each mutation is written back into the matching
  literal, then templates are re-rendered (`CompilationSnapshot.rerender`) with a **merged
  live context** so multi-collection templates stay consistent.
- Numbers are native JSON numbers (integers stay integers), booleans `true/false`, strings quoted.
- Non-list context (plain dicts, string lists, scalars) is read-only — no endpoint.
- Errors are JSON: `400` (bad request/data), `404` (missing), `405` (wrong method), `500` (others).
- `/events` is a Server-Sent-Events stream pushing `regenerated` / `compiler-error` events.
- `/` serves the rendered pages and `/static/**` serves project support files, same origin — no CORS.

## Project structure

```
src/
  app/                    # Entry point, web server, watcher, snapshot, data store
  antlr/python/           # ANTLR-generated lexer/parser
  visitor/                # 32 CST → AST visitors (python/, html/, css/, jinja/)
  ast/                    # 105 hand-written AST node classes
  semantic/               # 7 rules, named errors, jinja template checker
  symbolTable/            # Scoped symbol table
  generator/              # ContextExtractor, JinjaRenderer, OutputWriter
grammars/                 # Python/Html/Css ANTLR grammars
samples/                  # 10 folders: one per error type + CombinedErrors
docs/                     # architecture.html (EN) + architecture.ar.html (AR, RTL)
dependencies/             # antlr-4.13.2-complete.jar
```

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