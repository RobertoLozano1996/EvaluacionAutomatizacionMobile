package com.nttdata.steps;

import com.nttdata.screens.LoginProductsScreen;
import com.nttdata.screens.ProductsScreen;

public class LoginProductsSteps {

    LoginProductsScreen loginScreen;

    public void login(String username, String password){
        loginScreen.enterUser(username);
        loginScreen.enterPassword(password);
        loginScreen.clickLogin();
    }
}
