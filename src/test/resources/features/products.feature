@products
Feature: Compra de Prodcutos


  @loginProducts
  Scenario: Login con credenciales válidas

    Given estoy en la aplicación de SauceLabs
    When ingreso mis credenciales username "bod@example.com" y password "10203040"
    Then inicio sesión

  @validarProducto
  Scenario Outline: Validar producto

    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    And agrego "<UNIDADES>" del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente
    Examples:
      | PRODUCTO                  | UNIDADES |
      | Sauce Labs Backpack       | 1        |
      | Sauce Labs Bolt - T-Shirt | 1        |
      | Sauce Labs Bike Light     | 2        |