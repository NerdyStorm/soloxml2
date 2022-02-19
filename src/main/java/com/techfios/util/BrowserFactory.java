package com.techfios.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {

    WebDriver driver;
    String chromDriverLocation = "src/driver/chromedriver.exe";
    String chromePropertyKey = "webdriver.chrome.driver";
    String url = "https://www.techfios.com/billing";

    public WebDriver init(){

        System.setProperty(chromePropertyKey, chromDriverLocation);
        driver = new ChromeDriver();

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        return driver;

    }

}
