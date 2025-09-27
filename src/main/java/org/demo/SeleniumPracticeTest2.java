package org.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPracticeTest2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //Selenium Code Valid One
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

//        org.openqa.selenium.WebElement sundayCheckbox = driver.findElement(By.cssSelector("input[value='sunday']"));
//        sundayCheckbox.click();
//        if (sundayCheckbox.isSelected()) {
//            System.out.println("Sunday Checkbox Button is Selected");
//        } else {
//            System.out.println("Sunday Checkbox Button is not  Selected");
//        }


//       org.openqa.selenium.WebElement countryElement = driver.findElement(By.id("country"));
//
//        Select select = new Select(countryElement);
//        select.selectByValue("india");
//        Thread.sleep(10000);
//        select.deselectByValue("india");

//        driver.findElement(By.id("datepicker")).click();
//        org.openqa.selenium.WebElement dateElement =driver.findElement(By.xpath("//tbody//tr//td[@data-handler='selectDay']//a[@data-date='26']"));
//        dateElement.click();

//        org.openqa.selenium.WebElement startButton =driver.findElement(By.name("start"));
//
//
//        if(startButton.isEnabled()){
//            System.out.println("Start Button is Enabled");
//        }
//        else {
//            System.out.println("Start Button is not Enabled");
//        }
//
//        startButton.click();
//
//        org.openqa.selenium.WebElement stopButton =driver.findElement(By.name("stop"));
//
//        if(stopButton.isDisplayed() && stopButton.isEnabled()){
//            System.out.println("Stop Button is Displayed and Enabled");
//        }
//        else{
//            System.out.println("Stop Button is not Displayed and Enabled");
//        }


//        driver.findElement(By.id("alertBtn")).click();
//        Thread.sleep(1000);
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//
//        driver.findElement(By.id("confirmBtn")).click();
//        Thread.sleep(1000);
//        Alert confirmAlert = driver.switchTo().alert();
//        confirmAlert.dismiss();

        driver.findElement(By.id("promptBtn")).click();
        Thread.sleep(1000);


        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        promptAlert.sendKeys("Welcome to Automation Testing");
        Thread.sleep(1000);
        promptAlert.diclearsmiss();



    }
}
