from flask import Flask, render_template, request, redirect, url_for
from jinja2 import DictLoader

# Initialize Flask app
app = Flask(__name__)

# Simple in-memory database for products (simulating a list of dictionaries)
products = []

# --- HTML TEMPLATES DEFINITIONS ---

# 1. Base Template (Layout)
BASE_HTML = """
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Manager</title>

    <style>
    body {
        text-align: center;
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    header {
        background-color: #333;
        color: white;
        padding: 10px 0;
        margin-bottom: 20px;
    }

    header h1 {
        margin: 0;
    }

    nav {
        margin-top: 10px;
    }

    nav a {
        color: white;
        text-decoration: none;
        padding: 5px 15px;
        margin: 0 5px;
        border-radius: 4px;
        transition: background-color 0.3s;
    }

    nav a:hover {
        background-color: #555;
    }

    main {
        padding: 20px;
        max-width: 1200px;
        margin: auto;
    }

    .product-grid {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(280px,1fr));
        gap: 20px;
        padding: 20px;
        justify-content: center;
    }

    .product-card {
        background: white;
        padding: 15px;
        border-radius: 8px;
        text-align: center;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        transition: transform 0.2s;
    }

    .product-card:hover {
        transform: translateY(-5px);
    }

    .product-card img {
        width: 100%;
        height: 200px;
        object-fit: cover;
        border-radius: 6px;
        margin-bottom: 10px;
    }

    .price {
        color: #28a745;
        font-weight: bold;
        font-size: 1.2em;
        margin: 5px 0;
    }

    .btn {
        display: inline-block;
        padding: 8px 15px;
        background: #007bff;
        color: white;
        text-decoration: none;
        margin: 5px;
        border-radius: 5px;
        border: none;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    .btn:hover {
        background: #0056b3;
    }

    .btn.delete {
        background: #dc3545;
    }

    .btn.delete:hover {
        background: #c82333;
    }

    .form {
        max-width: 600px;
        margin: 20px auto;
        background: white;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        text-align: left;
    }

    .form label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }

    .form input,
    .form textarea {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    .detail-container {
        display: flex;
        gap: 40px;
        padding: 30px;
        text-align: left;
        background: white;
        border-radius: 8px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
    }

    .big-img {
        height: 300px;
        object-fit: cover;
        width: 400px;
        border-radius: 8px;
    }

    .info {
        flex-grow: 1;
    }
    </style>

</head>

<body>
    <header>
        <h1>Product Manager</h1>
        <nav>
            <a href="{{ url_for('index') }}">Home</a>
            <a href="{{ url_for('add_product') }}">Add Product</a>
        </nav>
    </header>

    <main>
        {% block content %}
        {% endblock %}
    </main>

</body>
</html>
"""
# CORRECTED: Closing quotes for BASE_HTML are here
INDEX_HTML = """
{% extends 'base.html' %}

{% block content %}
<h2>All Products</h2>

<div class="product-grid">
    {% for p in products %}
    <div class="product-card">
        <img src="{{ p.img }}" alt="product image" onerror="this.onerror=null; this.src='https://placehold.co/250x200/cccccc/333333?text=No+Image';">
        <h3>{{ p.name }}</h3>
        <p class="price">${{ p.price }}</p>
        <a class="btn" href="{{ url_for('detail', product_id=p.id) }}">View</a>
        <a class="btn delete" href="{{ url_for('delete', product_id=p.id) }}">Delete</a>
    </div>
    {% endfor %}

    {% if products|length == 0 %}
    <p>No products yet. Add one!</p>
    {% endif %}
</div>

{% endblock %}
"""
# CORRECTED: Closing quotes for INDEX_HTML are here
ADD_HTML = """
{% extends 'base.html' %}

{% block content %}
<h2>Add Product</h2>

<form method="POST" class="form">
    <label>Name</label>
    <input type="text" name="name" required>

    <label>Price</label>
    <input type="number" name="price" step="0.01" required>

    <label>Description</label>
    <textarea name="description" required></textarea>

    <label>Specification</label>
    <textarea name="specification" required></textarea>

    <label>Image URL (Optional)</label>
    <input type="text" name="img" placeholder="e.g., https://placehold.co/400x300">

    <button type="submit" class="btn">Add Product</button>
</form>

{% endblock %}
"""
# CORRECTED: Closing quotes for ADD_HTML are here
DETAIL_HTML = """
{% extends 'base.html' %}

{% block content %}
<div class="detail-container">

    <img class="big-img" src="{{ product.img }}" alt="product image" onerror="this.onerror=null; this.src='https://placehold.co/400x300/cccccc/333333?text=No+Image';">

    <div class="info">
        <h2>{{ product.name }}</h2>
        <p class="price">${{ product.price }}</p>

        <h3>Description</h3>
        <p>{{ product.description }}</p>

        <h3>Specifications</h3>
        <p>{{ product.specification }}</p>

        <a class="btn delete" href="{{ url_for('delete', product_id=product.id) }}">Delete Product</a>
    </div>

</div>
{% endblock %}
"""
# CORRECTED: Closing quotes for DETAIL_HTML are here


# =========================================
#         REGISTER ALL TEMPLATES
# =========================================
# Load all template strings into Jinja2's DictLoader
app.jinja_loader = DictLoader(
    {
        "base.html": BASE_HTML,
        "index.html": INDEX_HTML,
        "add.html": ADD_HTML,
        "detail.html": DETAIL_HTML,
    }
)


# =========================================
#               ROUTES
# =========================================

# Home page - Lists all products
@app.route("/")
def index():
    return render_template("index.html", products=products)


# Add Product page (Handles GET for form and POST for submission)
@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        product = {
            # Assign unique ID based on current list length + 1
            "id": len(products) + 1,
            "name": request.form.get("name"),
            "price": float(request.form.get("price")),
            "description": request.form.get("description"),
            "specification": request.form.get("specification"),
            # Use placeholder if image URL is empty
            "img": request.form.get("img") or "https://placehold.co/400x300/cccccc/333333?text=Product+Image",
        }
        products.append(product)
        return redirect(url_for("index"))

    return render_template("add.html")


# Product detail page
@app.route("/product/<int:product_id>")
def detail(product_id):
    # Find the product by ID
    product = next((p for p in products if p["id"] == product_id), None)

    if not product:
        # Simple error handling - redirect to home if product is not found
        return redirect(url_for("index"))

    return render_template("detail.html",
                           product=product)


# Delete product action
@app.route("/delete/<int:product_id>")
def delete(product_id):
    global products
    # Filter out the product with the matching ID
    products = [p for p in products if p["id"] != product_id]
    return redirect(url_for("index"))


if __name__ == "__main__":
    app.run(debug=True)