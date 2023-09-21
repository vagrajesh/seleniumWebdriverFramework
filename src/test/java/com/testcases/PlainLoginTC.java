package com.testcases;

import com.library.BrowserFunctions;
import com.pages.LoginPage;
import com.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlainLoginTC {
    public static void main(String[] args) throws InterruptedException {
        //call test case 1
        System.out.println("Test case 1");
        //LoginTC1 loginTC1 = new LoginTC1();
        // Initialise Webdriver class in Chrome
        WebDriver driver = new ChromeDriver();

        // Create object of browser functions (Create space for browser functions)
        BrowserFunctions browserFunctions = new BrowserFunctions(driver);
        //Creating object of home page (Create space for login page in main class)
        LoginPage loginPage = new LoginPage(driver);
        //Creating object for WelcomePage
        WelcomePage welcomePage = new WelcomePage(driver);

        // Test Steps
        browserFunctions.launchApplication();
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginBtn();
        /*String title = browserFunctions.getTitle();
        Assert.assertEquals("Guru99 Bank Manager HomePage",title);
        String a = welcomePage.getWelcomeMsg();
        System.out.println(a);
        System.out.println(b);*/
        browserFunctions.closeApplication();
    }
}
