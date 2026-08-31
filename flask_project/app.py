from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

# ---- RAM STORAGE ----
products = [
    {
        "id": 1,
        "name": "Wireless Mouse",
        "price": 25,
        "description": "Ergonomic 2.4GHz wireless mouse, silent clicks",
        "specification": "DPI 800-2400, USB receiver",
        "img": "static/images/mouse.png"
    },
    {
        "id": 2,
        "name": "Mechanical Keyboard",
        "price": 79,
        "description": "Blue-switch RGB backlit keyboard for gaming and typing",
        "specification": "87 keys, USB-C, hot-swappable",
        "img": "static/images/keyboard.png"
    },
    {
        "id": 3,
        "name": '27" 4K Monitor',
        "price": 349,
        "description": "UHD IPS display with 99% sRGB for designers",
        "specification": "27in, 60Hz, HDMI+DisplayPort",
        "img": "static/images/monitor.png"
    },
    {
        "id": 4,
        "name": "USB-C Hub",
        "price": 39,
        "description": "7-in-1 adapter with HDMI 4K and SD card slots",
        "specification": "USB-C, 100W PD pass-through",
        "img": "static/images/hub.png"
    },
    {
        "id": 5,
        "name": "Noise-Cancelling Headphones",
        "price": 199,
        "description": "Over-ear ANC headphones, 30h battery",
        "specification": "Bluetooth 5.3, foldable, mic",
        "img": "static/images/headphones.png"
    },
    {
        "id": 6,
        "name": "Webcam 1080p",
        "price": 59,
        "description": "Full-HD webcam with autofocus for calls",
        "specification": "1080p/30fps, plug-and-play",
        "img": "static/images/webcam.png"
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
