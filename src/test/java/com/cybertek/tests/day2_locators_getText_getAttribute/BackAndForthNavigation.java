package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {
        /**
         * TC #3: Back and forth navigation
         * 1- Open a chrome browser
         * 2- Go to: https://google.com
         * 3- Click to Gmail from top right.
         * 4- Verify title contains:
         * Expected: Gmail
         * 5- Go back to Google by using the .back();
         * 6- Verify title equals:
         * Expected: Google
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        // find gmail inside google
        //   locating the web element ---------> click()
        driver.findElement(By.partialLinkText("mail")).click();
       // driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title is passed !!");
        }else{
            System.out.println("Title is failed !!");
        }
        driver.navigate().back();
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle =driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Title Passed");
        }else{
            System.out.println("Title Failed");
        }

        driver.close();

    }
}
