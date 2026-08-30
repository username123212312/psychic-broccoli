from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

# ---- RAM STORAGE ----
products = [
    {
        "id": 4,
        "name": "Yousef Razzouk",
        "price": 234324,
        "description": "dsfsdf",
        "specification": "dsfsdf",
        "img": "static/images/default.png"
    },
    {
            "id": 5,
            "name": "dafsasd",
            "price": 2111,
            "description": "ss",
            "specification": "dsfsdf",
            "img": "static/images/default.png"
        }
]  # each product is a dict

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
        return redirect(url_for("index"))

    return render_template("add.html")


@app.route("/product/<int:product_id>")
def detail(product_id):
    product = next((p for p in products if p["id"] == product_id), None)
    return render_template("detail.html", product=product)


@app.route("/edit/<int:product_id>", methods=["GET", "POST"])
def edit_product(product_id):
    product = next((p for p in products if p["id"] == product_id), None)
    if request.method == "POST":
        product["name"] = request.form.get("name")
        product["price"] = request.form.get("price")
        product["description"] = request.form.get("description")
        product["specification"] = request.form.get("specification")
        product["img"] = request.form.get("img") or "static/images/default.png"
        return redirect(url_for("detail", product_id=product_id))

    return render_template("edit.html", product=product)


@app.route("/delete/<int:product_id>")
def delete(product_id):
    global products
    products = [p for p in products if p["id"] != product_id]
    return redirect(url_for("index"))


if __name__ == "__main__":
    app.run(debug=True)
