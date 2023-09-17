package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonHomePage {
    //Contructor
    WebDriver driver;
    public  AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }
    // Test Data
    String amazonUrl = "https://www.amazon.com/";

    // Locators
    // Language English Locator


    //Methods
   // Get URL Method
    public void amazonAppLaunch() throws InterruptedException {
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    //Select Language method
    public void selectEnglishLanguage() throws InterruptedException {
        WebElement englishLanguageSelector = driver.findElement(By.xpath("//*[@class='nav-a nav-a-2 icp-link-style-2']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(englishLanguageSelector).perform();
        Thread.sleep(1000);
    }
}
