package com.techfios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //WebElement Library
    @FindBy (how = How.XPATH, using = "//input[@id='username']") WebElement username;
    @FindBy (how = How.XPATH, using = "//input[@id='password']") WebElement password;
    @FindBy (how = How.XPATH, using = "//button[text()='Sign in']") WebElement submit;

    public void login(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        submit.click();
    }
    
}
