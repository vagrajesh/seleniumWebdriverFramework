package com.testcases;

import com.pages.AmazonHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomeTestCase1 {
    //Main function
    public static void main(String[] args) throws InterruptedException {
        // Initialise Webdriver class in Chrome
        WebDriver driver = new ChromeDriver();
        // Create Class Objects
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        // Test Steps
        amazonHomePage.amazonAppLaunch();
        amazonHomePage.selectEnglishLanguage();
    }
}
