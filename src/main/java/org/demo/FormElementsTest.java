package org.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormElementsTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //Selenium Code Valid One
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        org.openqa.selenium.WebElement userNameElement = driver.findElement(By.id("name"));
        userNameElement.sendKeys("Mahesh");
        java.lang.String userNameElementAttribute = userNameElement.getAttribute("value");
        System.out.println("User Name Attribute Value :" + userNameElementAttribute);
        userNameElement.clear();

        org.openqa.selenium.WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='male']"));
        maleRadioButton.click();
        if (maleRadioButton.isSelected()) {
            System.out.println("Male Radio Button is Selected");
        } else {
            System.out.println("Male Radio Button is not  Selected");
        }


        org.openqa.selenium.WebElement femalRadioButton = driver.findElement(By.xpath("//input[@value='female']"));
        if (femalRadioButton.isSelected()) {
            System.out.println("female Radio Button is Selected");
        } else {
            System.out.println("female Radio Button is not  Selected");
        }
        driver.quit();

    }
}
