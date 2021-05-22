package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//TC #2: Cybertekpractice toolverifications
// 1.Open Chrome browser
// 2.Go to https://practice.cybertekschool.com
// 3.Verify URL containsExpected: cybertekschool
// 4.Verify title: Expected: Practice

public class CyberTekPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        driver.get("https://practice.cybertekschool.com");
       // String title = "https://practice.cybertekschool.com";

        String url = driver.getCurrentUrl();

        Thread.sleep(2000);

        String expectedTitle="cybertekschool";
        System.out.println("expectedTitle = " + expectedTitle);

        String verifyTitle = "practice";
        System.out.println("verifyTitle = " + verifyTitle);

        if(url.contains(expectedTitle) && url.contains(verifyTitle)){
            System.out.println("title is passed!!");
        }else{
            System.out.println("Title is failed!!!");
        }
        driver.close();



    }
}
