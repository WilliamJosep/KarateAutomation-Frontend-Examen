Feature: Carrito de Compras

  Scenario: Agregar un producto al carrito

    Given el usuario inicia sesion
    When agrega el producto "Sauce Labs Backpack"
    Then el carrito contiene 1 producto