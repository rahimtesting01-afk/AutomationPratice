package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SauceDemoLoginTest {
    private static final Logger log = LoggerFactory.getLogger(SauceDemoLoginTest.class);

    public static void main(String[] args) {

        //1. Can't create Object for Interface and Abstract class
        //2. We can create Object only for Concrete or Non-Abstract class
        //3.We can create Object with interfaceReference(Ex: WebDriver driver = new ChromeDriver();)


        //Required this code for Managing Browsers Installation
        WebDriverManager.chromedriver().setup();

        //Selenium Code Valid One
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        org.openqa.selenium.WebElement formGroupElement = driver.findElement(By.className("form_group"));
        if(formGroupElement.isDisplayed()){
            System.out.println("Form Group is Displayed");
        }
        else{
            System.out.println("Form Group is not Displayed");
        }

        org.openqa.selenium.WebElement userNameElement = driver.findElement(By.id("user-name"));
        if(userNameElement.isDisplayed()){
            System.out.println("userName is Displayed");
        }
        else{
            System.out.println("userName is not Displayed");
        }

        userNameElement.sendKeys("     userNameElementWithTagName");



//        org.openqa.selenium.WebElement userNameElementWithTagName = driver.findElement(By.tagName("input"));
//        if(userNameElementWithTagName.isDisplayed()){
//            System.out.println("userNameElementWithTagName is Displayed");
//        }
//        else{
//            System.out.println("userNameElementWithTagName is not Displayed");
//        }

        org.openqa.selenium.WebElement passwordElement = driver.findElement(By.name("password"));
        if(passwordElement.isDisplayed()){
            System.out.println("password is Displayed");
        }
        else{
            System.out.println("password is not Displayed");
        }

        org.openqa.selenium.WebElement loginButtonElement = driver.findElement(By.id("login-button"));
        if(loginButtonElement.isDisplayed()){
            System.out.println("loginButtonElement is Displayed");
        }
        else{
            System.out.println("loginButtonElement is not Displayed");
        }


        passwordElement.sendKeys("secret_sauce");


        org.openqa.selenium.WebElement AllItemsLinkText = driver.findElement(By.linkText("All Items"));
        if(AllItemsLinkText.isDisplayed()){
            System.out.println("AllItemsLinkText is Displayed");
        }
        else{
            System.out.println("AllItemsLinkText is not Displayed");
        }

        //org.openqa.selenium.WebElement AllItemsLinkText = driver.findElement(By.partialLinkText("Items"));
        if(AllItemsLinkText.isDisplayed()){
            System.out.println("AllItemsLinkText is Displayed");
        }
        else{
            System.out.println("AllItemsLinkText is not Displayed");
        }


        driver.quit();


    }
//        // Set up WebDriverManager to manage ChromeDriver
//        WebDriverManager.chromedriver().setup();
//
//        // Initialize ChromeDriver
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            // Navigate to SauceDemo login page
//            driver.get("https://www.saucedemo.com/");
//
//            // Enter username
//            driver.findElement(By.id("user-name")).sendKeys("standard_user");
//
//            // Enter password
//            driver.findElement(By.id("password")).sendKeys("secret_sauce");
//
//            // Click login button
//            driver.findElement(By.id("login-button")).click();
//
//            // Wait for the page to load
//            Thread.sleep(2000);
//
//            // Verify successful login by checking the title
//            if (driver.getTitle().equals("Swag Labs")) {
//                System.out.println("Login successful!");
//            } else {
//                System.out.println("Login failed.");
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            // Close the browser
//            driver.quit();
//        }
//    }
}
