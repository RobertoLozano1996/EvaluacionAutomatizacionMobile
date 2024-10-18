package com.nttdata.stepsdefinitios;

import com.nttdata.steps.LoginProductsSteps;
import com.nttdata.steps.ProductsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ProductsSD {

    @Steps
    ProductsSteps productsSteps;
    LoginProductsSteps loginProductsSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }
    @When("ingreso mis credenciales username {string} y password {string}")
    public void ingresoMisCredencialesUsernameYPassword(String username, String password) {
        loginProductsSteps.login(username,password);
    }

    @Then("inicio sesión")
    public void inicioDeSesión() {
    }
    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
    }

    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String unidades, String producto) {
        productsSteps.validar(unidades, producto);

    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
    }


}
