package com.library;

import org.openqa.selenium.WebDriver;

public class BrowserFunctions {
    // Create Webdriver Instance

    WebDriver driver;
    String appURL = "https://www.demo.guru99.com/V4/index.php";

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

    public String getTitle(){
        String title;
        //get the title
        title= driver.getTitle();
        return title;
    }

    public void closeApplication(){
        //close the browser
        driver.close();
    }
}
