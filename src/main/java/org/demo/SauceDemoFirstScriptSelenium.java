package org.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoFirstScriptSelenium {

    public static void main(String[] args) throws InterruptedException {

        //Required this code for Managing Browsers Installation
        WebDriverManager.chromedriver().setup();

        //Selenium Code Valid One
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        org.openqa.selenium.WebElement userNameElement = driver.findElement(By.xpath("//input[@data-test='username']"));
        userNameElement.clear();
        userNameElement.sendKeys("standard_user");

        org.openqa.selenium.WebElement passwordElement = driver.findElement(By.xpath("//input[@data-test='password']"));
        passwordElement.sendKeys("secret_sauce");

        org.openqa.selenium.WebElement submitButtonElement = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        submitButtonElement.click();

        Thread.sleep(20000);

        String titleElement = driver.getTitle();
        if(titleElement.equals("Swag Lab")){
            System.out.println("Title is Displayed");
        }
        else{
            System.out.println("Title is not Displayed");
        }
        driver.quit();


    }
}
