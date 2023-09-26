package com.pages;

import com.library.Utilities;
import io.qameta.allure.Allure;
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
    //@Step("Enter User Name")
    public void enterUserName(){
        Allure.step("Enter User Name");
        driver.findElement(userNameTxtBox).sendKeys(userName);
    }
    //Method to enter Password
    //@Step("Enter Password")
    public void enterPassword(){
        Allure.step("Enter Password");
        driver.findElement(passwordTxtBox).sendKeys(password);
    }
    //Method to Click Login Button
    //@Step("Click on Login Button")
    public void clickLoginBtn() throws InterruptedException {
        Allure.step("Click on Login Button");
        driver.findElement(loginBtn).click();
        Thread.sleep(1000);
    }
    //@Step("Click on Reset Button")
    public void clickResetBtn(){
        Allure.step("Click Reset Button");
        driver.findElement(resetBtn).click();
    }
   // @Step("Verify Login Page Title")
    public void verifyLoginPageTitle() throws InterruptedException {
        actualLoginTitle = driver.getTitle();
        Thread.sleep(1000);
        Allure.step("Verify Login Title is matching:" +"Actual Results: " + actualLoginTitle +" "+ "Expected Results:" + expectedLoginTitle);
        Assert.assertEquals(actualLoginTitle,expectedLoginTitle);
        Thread.sleep(1000);
    }
    //@Step("User {0} Logged into the application successfully")
    public void userLoginIntoApplication(String uName, String pwd) throws InterruptedException {

        driver.findElement(userNameTxtBox).sendKeys(uName);
        Allure.step("Enter User Name: " + uName);

        driver.findElement(passwordTxtBox).sendKeys(pwd);
        Allure.step("Enter Password: " + pwd);
        driver.findElement(loginBtn).click();
        Allure.step("Click login Button");
        Thread.sleep(3000);
    }

}
