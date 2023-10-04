package com.testcases;

import com.library.BrowserFunctions;
import com.library.Utilities;
import com.pages.LoginPage;
import com.pages.WelcomePage;
import io.qameta.allure.Allure;
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
        Allure.step("Application Launched Successfully");
        loginPage.verifyLoginPageTitle();
        Allure.step("Verify Login Page title " + Utilities.LOGIN_TITLE);
        loginPage.userLoginIntoApplication(userName, password);
        Allure.step("User Logged in as USERNAME: " + userName + " and Password: " + password);
        welcomePage.verifyWelcomePageTitle();
        Allure.step("Verify Welcome Page Title " + Utilities.WELCOME_PAGE_TITLE);
        welcomePage.verifyWelcomeTextAndMessage();
        Allure.step("Verify Welcome Text: " + Utilities.WELCOME_PAGE_TEXT + " and Message: " + Utilities.WELCOME_PAGE_MESSAGE);
    }
    @DataProvider
    public Object[][] loginTestData(){
        Object[][] loginData = new Object[2][2];
        // With Valid data
        loginData[0][0] ="mngr527083"; //userName
        loginData[0][1] = "pEnAnam"; // password

        //with invalid data
        //loginData[1][0] = "rajesh";
        //loginData[1][1] = "Password";
        return loginData;
    }
}
