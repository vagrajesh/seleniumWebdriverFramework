package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;

    // Constructor - automatically called as soon as the object of the class is created
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    // Test Data
    String userName = "mngr527083";
    String password = "pEnAnam";

    // Locators identification
    By userNameTxtBox = By.xpath("//input[@name = 'uid']");
    By passwordTxtBox = By.xpath("//input[@name = 'password']");
    By loginBtn = By.xpath("//input[@name = 'btnLogin']");
    By resetBtn = By.xpath("//input[@name='btnReset']");

    // Methods to enter test data into the application
    //Method to enter UserName
    public void enterUserName(){
        driver.findElement(userNameTxtBox).sendKeys(userName);
    }
    //Method to enter Password
    public void enterPassword(){
        driver.findElement(passwordTxtBox).sendKeys(password);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void clickResetBtn(){
        driver.findElement(resetBtn).click();
    }

}
