package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_GoogleSearchVerification {
    public static void main(String[] args) {
       //TC #4:	Google	search
        //1- Open	a	chrome	browser
        //2- Go	to:	https://google.com
        //3- Write	“apple”	in	search	box
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        //go to google.com
        driver.get("http://www.google.com");
        //Write"apple" in google box
       // driver.findElement(By.linkText("apple")).click();

        //3- Write	“apple”	in	search	box
       driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        //4- Click	google	search	button
        //5- Verify	title:
        //Expected:	Title	should	start	with	“apple”	word

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title is passed!!!!");
        }else{
            System.out.println("Title is failed!!!");
        }







    }
}
