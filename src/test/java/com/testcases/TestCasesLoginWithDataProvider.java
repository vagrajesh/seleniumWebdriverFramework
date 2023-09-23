package com.testcases;

import com.library.BrowserFunctions;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCasesLoginWithDataProvider {
    //Function Method
        //initialize webdriver object
            //create class objects

    WebDriver driver = new ChromeDriver();
    BrowserFunctions browserFunctions = new BrowserFunctions(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Test(dataProvider = "loginTestData")
    public void userLoginTests(String userName, String password) throws InterruptedException {
        browserFunctions.launchApplication();
        loginPage.userLoginIntoApplication(userName,password);
        browserFunctions.closeApplication();
    }
    @DataProvider
    public Object[][] loginTestData(){
        Object[][] loginData = new Object[2][2];
        // With Valid data
        loginData[0][0] ="mngr527083"; //user name
        loginData[0][1] = "pEnAnam"; // password

        //with invalid data
        loginData[1][0] = "rvagella";
        loginData[1][1] = "Password";

        return loginData;
    }
}
