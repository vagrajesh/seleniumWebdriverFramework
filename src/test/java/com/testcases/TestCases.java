package com.testcases;

import com.library.BrowserFunctions;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
    //Create Webdriver class instance
    @Test
    public void TestCaseLogin() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
     //Create Browser functions class instance
     BrowserFunctions browserFunctions = new BrowserFunctions(driver);

     // Create Instances for LoginPAge
     LoginPage loginPage = new LoginPage(driver);
        browserFunctions.launchApplication();
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginBtn();
        browserFunctions.closeApplication();
    }
    @Test
    public void TestCaseLoginReset() throws InterruptedException {
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
}
