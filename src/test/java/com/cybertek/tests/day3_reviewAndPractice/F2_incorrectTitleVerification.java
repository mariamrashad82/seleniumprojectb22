package com.cybertek.tests.day3_reviewAndPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_incorrectTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Facebook incorrect login title verification
        // 1.Open Chrome browser
        // 2.Go to https://www.facebook.com


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        // 3.Enter incorrect username

     WebElement inputUserName= driver.findElement(By.id("email"));
     inputUserName.sendKeys("mariam.koko@yahoo.com"+ Keys.ARROW_DOWN);
        // 4.Enter incorrect password
    WebElement inputPassword = driver.findElement(By.id("pass"));
    inputPassword.sendKeys("koko1234"+ Keys.ARROW_DOWN);
       driver.findElement(By.name("login")).click();


     //driver.findElement(By.id("email")).sendKeys("user@gmail.com" + Keys.ARROW_DOWN);
        //        driver.findElement(By.id("pass")).sendKeys("pass" + Keys.ARROW_DOWN);
        //        driver.findElement(By.name("login")).click();


     
        // 5.Verify title changed to: Expected: “Log into Facebook”
     String expectedTitle= "Log into Facebook";
        Thread.sleep(5000);
     String actualTitle=driver.getTitle();
        //System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
           System.out.println("Title verification pass!!!");
        }else{
            System.out.println("Title verification failed");
        }










    }
}
