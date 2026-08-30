from flask import Flask, render_template

app = Flask(__name__)

items = [{"id": 1, "name": "laptop", "price": 100}]


@app.route("/")
def index():
    return render_template("index.html", items=items)