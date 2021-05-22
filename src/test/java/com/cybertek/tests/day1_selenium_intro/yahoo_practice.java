package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();


        driver.get("https://www.yahoo.com");
        Thread.sleep(2000);

        String expectedTitle="Yahoo";
        System.out.println("expectedTitle = " + expectedTitle);

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //creating our verification
        if(actualTitle.contains(expectedTitle)){
            System.out.println("title is passed!!");
        }else{
            System.out.println("Title is failed!!!");
        }
        driver.close();



        //System.out.println("Current title : "  +  driver.getTitle());
        //String currentUrl =  driver.getCurrentUrl();
        //System.out.println("currentUrl = " + currentUrl);

        // driver.navigate().back();
       // driver.navigate().forward();
       // driver.navigate().refresh();


    }
}
