package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    WebDriver driver;
    public WelcomePage(WebDriver driver){
        this.driver = driver;
    }

    //Locator to get Header Value
    By welcomeTxt = By.xpath("//h2[text()='Guru99 Bank']");
    By welcomeMsg = By.xpath("//marquee[text()=\"Welcome To Manager's Page of Guru99 Bank\"]");

    // Method to capture welcome text after successfull login

    public String getWelcomeText(){
        String welcomeText = driver.findElement(welcomeTxt).getText();
        return welcomeText;
    }

    public String getWelcomeMsg(){
        String welcomeMessage = driver.findElement(welcomeMsg).getText();
        return  welcomeMessage;
    }
}
