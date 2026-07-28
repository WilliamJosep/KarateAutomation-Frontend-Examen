package pages;

import com.microsoft.playwright.Page;

public class CheckoutPage {

    private final Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    public void abrirCarrito() {
        page.locator(".shopping_cart_link").click();
    }

    public void checkout() {
        page.locator("#checkout").click();
    }

    public void ingresarDatos(String nombre, String apellido, String codigoPostal) {

        page.locator("#first-name").fill(nombre);
        page.locator("#last-name").fill(apellido);
        page.locator("#postal-code").fill(codigoPostal);

        page.locator("#continue").click();
    }

    public void finalizarCompra() {
        page.locator("#finish").click();
    }

    public String obtenerMensaje() {
        return page.locator(".complete-header").textContent();
    }
}