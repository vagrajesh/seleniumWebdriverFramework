package com.library;

import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;

public class BrowserFunctions {
    String appURL = Utilities.BASE_URL;

    // Create Webdriver Instance
    WebDriver driver;
        // Constructor - automatically called as soon as the object of the class is created
    public BrowserFunctions(WebDriver driver) {
        this.driver = driver;
    }

    //create class to launch application in browser

    public void launchApplication() throws InterruptedException {
        Allure.step("Launch Application");
        driver.manage().window().maximize();
        driver.get(appURL);
        Thread.sleep(1000);
    }

    public void closeApplication(){
        Allure.step("Application Closed");
        //close the browser
        driver.quit();
    }
}
