package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private final Page page;

    // Constructor
    public LoginPage(Page page) {
        this.page = page;
    }

    // Localizadores
    private final String txtUsuario = "#user-name";
    private final String txtPassword = "#password";
    private final String btnLogin = "#login-button";

    // Métodos

    public void abrirAplicacion() {
        page.navigate("https://www.saucedemo.com/");
    }

    public void ingresarUsuario(String usuario) {
        page.locator(txtUsuario).fill(usuario);
    }

    public void ingresarPassword(String password) {
        page.locator(txtPassword).fill(password);
    }

    public void clickLogin() {
        page.locator(btnLogin).click();
    }

    public void login(String usuario, String password) {
        ingresarUsuario(usuario);
        ingresarPassword(password);
        clickLogin();
    }

    public String obtenerTituloPagina() {
        return page.title();
    }
}