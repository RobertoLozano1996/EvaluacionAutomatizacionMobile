package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;

public class ProductsSteps {
    ProductsScreen productsScreen;

    public void validar(String unidades, String productos){
        productsScreen.enterUnidades(unidades);
        productsScreen.enterProductos(productos);
        productsScreen.clickAgregar();
    }
}
