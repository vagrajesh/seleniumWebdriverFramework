package com.pages;

import com.library.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginPage {
    //Variables Objects
    WebDriver driver;
    String userName = Utilities.USER_NAME;
    String password = Utilities.PASSWORD;
    String expectedLoginTitle = Utilities.LOGIN_TITLE;
    String actualLoginTitle;

    // Constructor - automatically called as soon as the object of the class is created
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

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
    //Method to Click Login Button
    public void clickLoginBtn() throws InterruptedException {
        driver.findElement(loginBtn).click();
        Thread.sleep(1000);
    }

    public void clickResetBtn(){
        driver.findElement(resetBtn).click();
    }

    public void verifyLoginPageTitle() throws InterruptedException {
        actualLoginTitle = driver.getTitle();
        Thread.sleep(1000);
        Assert.assertEquals(actualLoginTitle,expectedLoginTitle);
        Thread.sleep(1000);
    }

}
