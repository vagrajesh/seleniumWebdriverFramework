package com.library;

import org.openqa.selenium.WebDriver;

public class BrowserFunctions {
    // Create Webdriver Instance

    WebDriver driver;
    String appURL = Utilities.BASE_URL;

    // Constructor - automatically called as soon as the object of the class is created
    public BrowserFunctions(WebDriver driver) {
        this.driver = driver;
    }

    //create class to launch application in browser
    public void launchApplication() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(appURL);
        Thread.sleep(1000);
    }
    public void closeApplication(){
        //close the browser
        driver.quit();
    }
}
