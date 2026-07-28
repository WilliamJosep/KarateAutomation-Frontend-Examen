Feature: Login en SauceDemo

Scenario: Login exitoso

Given el usuario abre la aplicacion
When ingresa el usuario "standard_user"
And ingresa la contrasena "secret_sauce"
And hace clic en Login
Then visualiza la pagina de productos