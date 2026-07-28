package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CartPage;
import pages.LoginPage;

public class CartSteps {

    private LoginPage loginPage;
    private CartPage cartPage;

    @Given("el usuario inicia sesion")
    public void iniciarSesion() {

        loginPage = new LoginPage(Hooks.page);

        loginPage.abrirAplicacion();
        loginPage.ingresarUsuario("standard_user");
        loginPage.ingresarPassword("secret_sauce");
        loginPage.clickLogin();

        cartPage = new CartPage(Hooks.page);
    }

    @When("agrega el producto {string}")
    public void agregarProducto(String producto) {

        cartPage.agregarProducto(producto);

    }

    @Then("el carrito contiene {int} producto")
    public void validarCantidad(int cantidadEsperada) {

        Assert.assertEquals(
                cantidadEsperada,
                cartPage.obtenerCantidadCarrito()
        );
    }
}