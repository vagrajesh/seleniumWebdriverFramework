package com.testcases;

import com.library.BrowserFunctions;
import com.pages.LoginPage;
import com.pages.WelcomePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCasesLoginWithDataProvider {
        WebDriver driver = new ChromeDriver();
        BrowserFunctions browserFunctions = new BrowserFunctions(driver);
        LoginPage loginPage = new LoginPage(driver);

        WelcomePage welcomePage = new WelcomePage(driver);

    @Test(dataProvider = "loginTestData")
    @Description("Verify User Logged in successfully")
    public void userLoginTests(String userName, String password) throws InterruptedException {
        browserFunctions.launchApplication();
        loginPage.verifyLoginPageTitle();
        loginPage.userLoginIntoApplication(userName, password);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomeTextAndMessage();
    }
    @DataProvider
    public Object[][] loginTestData(){
        Object[][] loginData = new Object[2][2];
        // With Valid data
        loginData[0][0] ="mngr527083"; //user name
        loginData[0][1] = "pEnAnam"; // password

        //with invalid data
        //loginData[1][0] = "rajesh";
        //loginData[1][1] = "Password";
        return loginData;
    }
}
