package com.cybertek.tests.day3_reviewAndPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
        // 1.Open Chrome browser
        // 2.Go to https://www.facebook.com
        // 3.Verify title: Expected: “Facebook -Log In or Sign Up”
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
           System.out.println("Title Passed!");
        }else {
            System.out.println("Title Failed");
        }
    }
}
