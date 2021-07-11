package com.cybertek.tests.day3_reviewAndPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeVerification {
    public static void main(String[] args) {
        //TC #4: Facebook header verification1.Open Chrome browser
        // 2.Go to https://www.facebook.com
        // 3.Verify “Create a page” link href value contains text: Expected: “registration_form”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        WebElement page = driver.findElement(By.linkText("Create a Page"));
        String expectedPage = "registration_form";
        String actualPage = page.getAttribute("href");

        if (actualPage.contains(expectedPage)) {
            System.out.println("Title verification pass!!!");
        } else {
            System.out.println("Title verification failed");


        }
    }
}
