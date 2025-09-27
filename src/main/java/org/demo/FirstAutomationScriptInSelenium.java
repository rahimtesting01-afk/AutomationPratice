package org.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationScriptInSelenium {

    public static void main(String[] args) {

        // Setup ChromeDriver using WebDriverManager
       WebDriverManager.chromedriver().setup();

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Close the browser
        driver.quit();

        //How may different ways to open a webiste in selenium


        driver.navigate().to("https://www.google.com");

    }


}


