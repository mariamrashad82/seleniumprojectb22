package com.cybertek.tests.day4_ClassSelector_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_multipleButtons {
    public static void main(String[] args) {
        //XPATH Practice
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        //3. Click on Button 1
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        String expectedTitle = "Clicked on button one!";
        String actualTitle = resultText.getText();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification pass!!!");
        } else {
            System.out.println("Title verification failed");


        }
    }
}