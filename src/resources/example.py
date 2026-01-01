from flask import Flask, render_template, request, redirect, url_for
import json, os
from werkzeug.utils import secure_filename

app = Flask(__name__)
DATA = "products.json"
IMG = "static/images"
os.makedirs(IMG, exist_ok=True)

def load():
    return json.load(open(DATA, "r", encoding="utf8")) if os.path.exists(DATA) else []

def save(p):
    json.dump(p, open(DATA, "w", encoding="utf8"), ensure_ascii=False, indent=2)

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/products")
def products():
    return render_template("products.html", products=load())

@app.route("/add", methods=["GET","POST"])
def add_product():
    if request.method == "POST":
        name = request.form["name"]
        price = request.form["price"]

        # ✅ شرط يمنع القيم السالبة أو غير الرقمية
        if not price.isdigit() or int(price) < 0:
            return render_template("add_product.html", error="❌ السعر يجب أن يكون رقمًا غير سالب")
        img = request.files["image"]
        img_name = secure_filename(img.filename) if img.filename else None

        if img_name:
            img.save(os.path.join(IMG, img_name))
            data = load()
            data.append({"name": name, "price": price, "image": img_name})
            save(data)
            return redirect(url_for("products"))
        return render_template("add_product.html")


@app.route("/product/<name>")
def product_detail(name):
    product = next((p for p in load() if p["name"] == name), None)
    return render_template("product_detail.html", product=product) if product else "❌ المنتج غير موجود"

if name == "main":
    app.run(debug=True)

if __name__ == "__main__":
 app.run(debug=True)