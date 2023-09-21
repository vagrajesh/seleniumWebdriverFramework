package com.testcases;

import com.library.BrowserFunctions;
import com.pages.LoginPage;
import com.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCasesTestNG {
    //Create Webdriver class instance
    @Test
    public void testCaseLogin() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
     //Create Browser functions class instance
     BrowserFunctions browserFunctions = new BrowserFunctions(driver);

     // Create Instances for LoginPAge
     LoginPage loginPage = new LoginPage(driver);
        browserFunctions.launchApplication();
        loginPage.verifyLoginPageTitle();
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginBtn();
        browserFunctions.closeApplication();
    }
    @Test //TestNG Command
    public void testCaseLoginReset() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Create Browser functions class instance
        BrowserFunctions browserFunctions = new BrowserFunctions(driver);
        // Create Instances for LoginPAge
        LoginPage loginPage = new LoginPage(driver);
        browserFunctions.launchApplication();
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickResetBtn();
        browserFunctions.closeApplication();
    }
    @Test
    public void testCaseWelcome() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        BrowserFunctions browserFunctions = new BrowserFunctions(driver);
        browserFunctions.launchApplication();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginBtn();

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomeTextAndMessage();
        browserFunctions.closeApplication();
    }
}