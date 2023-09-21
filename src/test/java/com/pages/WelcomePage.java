package com.pages;

import com.library.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WelcomePage {
    WebDriver driver;
    String actualWelcomePageTitle;
    String actualWelcomePageText;
    String actualWelcomePageMessage;
    String expectedWelcomePageTitle = Utilities.WELCOME_PAGE_TITLE;
    String expectedWelcomePageTxt = Utilities.WELCOME_PAGE_TEXT;
    String expectedWelcomePageMessage = Utilities.WELCOME_PAGE_MESSAGE;
    // Constructor
    public WelcomePage(WebDriver driver){
        this.driver = driver;
    }

    //Locator to get Header Value
    By welcomeTxt = By.xpath("//h2[text()='Guru99 Bank']");
    By welcomeMsg = By.xpath("//marquee[text()=\"Welcome To Manager's Page of Guru99 Bank\"]");

    // Method to Verify welcome page Title
    public void verifyWelcomePageTitle() throws InterruptedException {
        actualWelcomePageTitle = driver.getTitle();
        Thread.sleep(1000);
        Assert.assertEquals(actualWelcomePageTitle, expectedWelcomePageTitle);
        Thread.sleep(1000);
    }
    // Method to Verify Welcome Message
    public void verifyWelcomeTextAndMessage() throws InterruptedException {
        actualWelcomePageText = driver.findElement(welcomeTxt).getText();
        Thread.sleep(1000);
        Assert.assertEquals(actualWelcomePageText, expectedWelcomePageTxt);
        Thread.sleep(1000);
        actualWelcomePageMessage = driver.findElement(welcomeMsg).getText();
        Thread.sleep(1000);
        Assert.assertEquals(actualWelcomePageMessage,expectedWelcomePageMessage);
    }
}
