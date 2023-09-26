package com.testcases;

import com.library.BrowserFunctions;
import com.pages.LoginPage;
import com.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasesTestNG {
    //Create Webdriver class instance
   // @Test(priority = 1, description = "LOGIN TESTS")
    //@Description ("Verify User is able to Login successfully with correct credentials")
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
    //@Test(priority = 2, description = "LOGIN TESTS")
    //@Description ("Verify User is able to RESET and entered data is cleared")
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
    //@Test(priority = 3, description = "LOGIN TESTS")
   // @Description("Verify User Logged in successfully and Welcome page displayed")
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