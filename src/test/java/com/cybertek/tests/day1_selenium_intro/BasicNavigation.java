package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //1-setup the browser driver
        WebDriverManager.chromedriver().setup();
        //2-creat instance of selenium web driver
        //this line open the browser
        WebDriver driver= new ChromeDriver();
        //this line maximize the browser
        driver.manage().window().maximize();
        //this line full screen the browser
        driver.manage().window().fullscreen();

        //3- get the page for tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("Current title : "  +  driver.getTitle());
        String currentUrl =  driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        //putting 3 seconds of wait? stop the code foe 3 second
        Thread.sleep(3000);

        //going back using navigation
        driver.navigate().back();



        //putting 3 seconds of wait? stop the code foe 3 second
        Thread.sleep(3000);

        //going forward using navigation
        driver.navigate().forward();


        //refreshing the page navigation
        driver.navigate().refresh();

        //going to another url using.to()method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title : "  +  driver.getTitle());
         currentUrl =  driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //this line maximize the browser
        driver.manage().window().maximize();

        //this method will close the current open browser
        driver.close();

        //this line will close all the open browser or tabs
        driver.quit();


    }
}
