(() => {
    "use strict";

    const main = document.querySelector("main");
    if (!main) return;

    let mutationInFlight = false;

    const escapeHtml = (value) => String(value ?? "")
        .replaceAll("&", "&amp;")
        .replaceAll("<", "&lt;")
        .replaceAll(">", "&gt;")
        .replaceAll('"', "&quot;")
        .replaceAll("'", "&#039;");

    const productImage = (product) => {
        const image = product.img || "static/images/default.png";
        return image.startsWith("static/") ? `/${image}` : image;
    };

    async function api(path, options = {}) {
        const response = await fetch(path, {
            headers: { "Accept": "application/json", ...(options.headers || {}) },
            ...options,
        });
        if (!response.ok) {
            let message = `Request failed (${response.status}).`;
            try {
                const data = await response.json();
                message = data.error || message;
            } catch (_) {
                // Keep the HTTP status fallback.
            }
            throw new Error(message);
        }
        return response.status === 204 ? null : response.json();
    }

    function showError(message) {
        const old = document.querySelector(".runtime-error");
        if (old) old.remove();
        const alert = document.createElement("p");
        alert.className = "runtime-error";
        alert.setAttribute("role", "alert");
        alert.textContent = message;
        main.prepend(alert);
    }

    function pathId(prefix) {
        const match = window.location.pathname.match(new RegExp(`^/${prefix}/(\\d+)$`));
        return match ? Number(match[1]) : null;
    }

    function isAddPage() {
        return window.location.pathname === "/add" || window.location.pathname === "/add_product.html";
    }

    function productForm(product = {}) {
        const isEditing = Boolean(product.id);
        return `
            <h2>${isEditing ? "Edit Product" : "Add Product"}</h2>
            <form class="form" data-product-form="${isEditing ? product.id : "new"}">
                <label>Name</label>
                <input type="text" name="name" value="${escapeHtml(product.name)}" required>

                <label>Price</label>
                <input type="number" name="price" min="0" step="0.01" value="${escapeHtml(product.price)}" required>

                <label>Description</label>
                <textarea name="description" required>${escapeHtml(product.description)}</textarea>

                <label>Specification</label>
                <textarea name="specification" required>${escapeHtml(product.specification)}</textarea>

                <label>Image URL (local path)</label>
                <input type="text" name="img" value="${escapeHtml(product.img)}" placeholder="static/images/example.png">

                <button type="submit" class="btn">${isEditing ? "Update" : "Add"}</button>
                <a class="btn" href="/">Cancel</a>
            </form>`;
    }

    function renderIndex(products) {
        const cards = products.map((product) => `
            <article class="product-card">
                <img src="${escapeHtml(productImage(product))}" alt="${escapeHtml(product.name)}" onerror="this.style.display='none'">
                <h3>${escapeHtml(product.name)}</h3>
                <p class="price">$${escapeHtml(product.price)}</p>
                <a class="btn" href="/product/${product.id}">View</a>
                <a class="btn" href="/edit/${product.id}">Edit</a>
                <button class="btn delete" type="button" data-delete-product="${product.id}">Delete</button>
            </article>`).join("");
        main.innerHTML = `
            <h2>All Products</h2>
            <div class="product-grid">
                ${cards || "<p>No products yet. Add one!</p>"}
            </div>`;
    }

    async function renderCurrentPage() {
        const editId = pathId("edit");
        const detailId = pathId("product");

        if (isAddPage()) {
            main.innerHTML = productForm();
            return;
        }
        if (editId !== null) {
            const product = await api(`/api/products/${editId}`);
            main.innerHTML = productForm(product);
            return;
        }
        if (detailId !== null) {
            const product = await api(`/api/products/${detailId}`);
            main.innerHTML = `
                <h2>${escapeHtml(product.name)}</h2>
                <section class="product-card">
                    <img src="${escapeHtml(productImage(product))}" alt="${escapeHtml(product.name)}" onerror="this.style.display='none'">
                    <p class="price">$${escapeHtml(product.price)}</p>
                    <p>${escapeHtml(product.description)}</p>
                    <p><strong>Specification:</strong> ${escapeHtml(product.specification)}</p>
                    <a class="btn" href="/edit/${product.id}">Edit</a>
                    <button class="btn delete" type="button" data-delete-product="${product.id}">Delete</button>
                    <a class="btn" href="/">Back</a>
                </section>`;
            return;
        }
        renderIndex(await api("/api/products"));
    }

    document.addEventListener("submit", async (event) => {
        const form = event.target.closest("form[data-product-form]");
        if (!form) return;
        event.preventDefault();
        mutationInFlight = true;
        const id = form.dataset.productForm;
        const isNew = id === "new";
        const button = form.querySelector("button[type=submit]");
        button.disabled = true;
        try {
            const product = await api(isNew ? "/api/products" : `/api/products/${id}`, {
                method: isNew ? "POST" : "PUT",
                body: new URLSearchParams(new FormData(form)),
            });
            window.location.assign(`/product/${product.id}`);
        } catch (error) {
            showError(error.message);
            button.disabled = false;
            mutationInFlight = false;
        }
    });

    document.addEventListener("click", async (event) => {
        const button = event.target.closest("[data-delete-product]");
        if (!button) return;
        const id = button.dataset.deleteProduct;
        if (!window.confirm("Delete this product?")) return;
        mutationInFlight = true;
        button.disabled = true;
        try {
            await api(`/api/products/${id}`, { method: "DELETE" });
            window.location.assign("/");
        } catch (error) {
            showError(error.message);
            button.disabled = false;
            mutationInFlight = false;
        }
    });

    const stream = new EventSource("/events");
    stream.addEventListener("regenerated", () => {
        if (!mutationInFlight) window.location.reload();
    });
    stream.addEventListener("compiler-error", (event) => {
        try {
            showError(`Compiler error: ${JSON.parse(event.data).detail}`);
        } catch (_) {
            showError("Compiler error while regenerating the interface.");
        }
    });

    renderCurrentPage().catch((error) => showError(error.message));
})();
