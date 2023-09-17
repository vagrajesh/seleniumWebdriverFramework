package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LoginPageScripts {

    //Create webdriver instance
    WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
       System.out.println("Hello");
        LoginPageScripts loginPageScripts = new LoginPageScripts();
        loginPageScripts.launchApplication();
        Thread.sleep(10000);
        loginPageScripts.verifytitle();
        loginPageScripts.closeapplication();
        }

        public void launchApplication(){
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            System.out.println("Application Launched");
        }

        public void verifytitle(){
            String title = driver.getTitle();
            System.out.println(title);
           // Assert.assertEquals("Google",title);
        }
        public void closeapplication(){
            driver.close();
        }
}