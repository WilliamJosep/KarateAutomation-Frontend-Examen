package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;

public class CheckoutSteps {

    private LoginPage loginPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Given("el usuario tiene un producto en el carrito")
    public void prepararCompra() {

        loginPage = new LoginPage(Hooks.page);

        loginPage.abrirAplicacion();
        loginPage.ingresarUsuario("standard_user");
        loginPage.ingresarPassword("secret_sauce");
        loginPage.clickLogin();

        cartPage = new CartPage(Hooks.page);
        cartPage.agregarProducto("Sauce Labs Backpack");

        checkoutPage = new CheckoutPage(Hooks.page);
    }

    @When("completa el checkout")
    public void checkout() {

        checkoutPage.abrirCarrito();
        checkoutPage.checkout();
        checkoutPage.ingresarDatos(
                "William",
                "Quiroz",
                "15006"
        );
        checkoutPage.finalizarCompra();
    }

    @Then("visualiza el mensaje {string}")
    public void validarMensaje(String mensajeEsperado) {

        Assert.assertEquals(
                mensajeEsperado,
                checkoutPage.obtenerMensaje()
        );
    }
}