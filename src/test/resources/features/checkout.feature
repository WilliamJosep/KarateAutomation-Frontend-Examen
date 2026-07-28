Feature: Checkout

  Scenario: Compra exitosa

    Given el usuario tiene un producto en el carrito
    When completa el checkout
    Then visualiza el mensaje "Thank you for your order!"