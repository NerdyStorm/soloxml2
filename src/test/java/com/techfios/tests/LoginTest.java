package com.techfios.tests;

import com.techfios.pages.LoginPage;
import com.techfios.util.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BrowserFactory{

    WebDriver driver;
    LoginPage loginPage; 
    // String user = "demo@techfios.com";
    // String pass = "abc123";

    @BeforeMethod
    public void initialization(){
        driver = init();
        loginPage = new LoginPage(driver);
    }

    @Test
    @Parameters({"username1", "password1"})
    public void Login(String user, String pass){

        loginPage.login(user, pass);

    }
}
