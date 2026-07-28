package stepdefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("el usuario abre la aplicacion")
    public void abrir() {
        System.out.println("Given OK");
    }

    @When("ingresa el usuario {string}")
    public void usuario(String u) {
        System.out.println("When usuario");
    }

    @When("ingresa la contrasena {string}")
    public void password(String p) {
        System.out.println("When password");
    }

    @And("hace clic en Login")
    public void login() {
        System.out.println("Login");
    }

    @Then("visualiza la pagina de productos")
    public void productos() {
        System.out.println("Then OK");
    }
}