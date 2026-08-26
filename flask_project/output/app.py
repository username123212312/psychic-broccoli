from flask import Flask, render_template, request, redirect, url_for, abort

app = Flask(__name__)

# ---- RAM STORAGE ----
products = [
    {
        "id": 1,
        "name": "Phone",
        "price": 300,
        "description": "A great phone with amazing features.",
        "specification": "6.1 inch display, 128GB storage, 12MP camera",
        "img": "static/images/phone.png"
    },
    {
        "id": 2,
        "name": "ewdew",
        "price": "12",
        "description": "aopeo",
        "specification": "opopo",
        "img": "kpkp"
    }
]  # each product is a dict

import subprocess, json, re, sys, os

def _save_and_recompile():
    """Rewrite the source app.py with current in-memory products, then re-run compiler."""
    try:
        src_path = r'C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/flask_project/app.py'
        with open(src_path, 'r', encoding='utf-8') as f:
            src = f.read()
        products_json = json.dumps(products, indent=4)
        products_py = 'products = ' + products_json + '  # each product is a dict\n'
        src = re.sub(
            r'products\s*=\s*\[[\s\S]*?\]\s*# each product is a dict',
            products_py,
            src,
            count=1
        )
        with open(src_path, 'w', encoding='utf-8') as f:
            f.write(src)
        cp = r'C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/dependencies/antlr-4.13.2-complete.jar;C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/build;C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/out/production/compiler_project'
        subprocess.Popen(
            ['java', '-cp', cp, 'app.App', r'C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/flask_project'],
            cwd=r'C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/flask_project'
        )
        print('[recompile] Source updated, compiler triggered.')
    except Exception as e:
        print(f'[recompile error] {e}')





multi = """
hello world
"""

@app.route("/")
def index():
    return render_template("index.html", products=products)


@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        name = request.form.get("name")
        price = request.form.get("price")
        description = request.form.get("description")
        specification = request.form.get("specification")
        img = request.form.get("img") or "static/images/default.png"

        product = {
            "id": len(products) + 1,
            "name": name,
            "price": price,
            "description": description,
            "specification": specification,
            "img": img,  # local placeholder
        }

        products.append(product)
        _save_and_recompile()
        return redirect(url_for("index"))

    return render_template("add.html")


@app.route("/product/<int:product_id>")
def detail(product_id):
    product = next((p for p in products if p["id"] == product_id), None)

    return render_template("detail.html", product=product)


@app.route("/delete/<int:product_id>")
def delete(product_id):
    global products
    products = [p for p in products if p["id"] != product_id]
    _save_and_recompile()
    return redirect(url_for("index"))


if __name__ == "__main__":
    app.run(debug=True)
