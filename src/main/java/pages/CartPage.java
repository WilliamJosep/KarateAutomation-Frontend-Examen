package pages;

import com.microsoft.playwright.Page;

public class CartPage {

    private final Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public void agregarProducto(String producto) {

        page.locator("text=" + producto).click();

        page.locator("#add-to-cart").click();
    }

    public int obtenerCantidadCarrito() {

        String cantidad = page.locator(".shopping_cart_badge").textContent();

        return Integer.parseInt(cantidad);
    }
}