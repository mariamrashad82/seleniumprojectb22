package com.cybertek.tests.day4_ClassSelector_Practice;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T5_WebOrderLogin {
    public static void main(String[] args) throws InterruptedException {
        //TC#5: Basic login authentication
        // 1-Open a chrome browser
        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3-Verify title equals:Expected: Web Orders Login
        // 4-Enter username: Tester
        // 5-Enter password: test
        // 6-Click “Sign In” button
        // 7-Verify titleequals:Expected: Web Orders

        // 1-Open a chrome browser
        WebDriverManager.chromedriver().setup();
      WebDriver driver = WebDriverFactory.getDriver("safari");


        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3-Verify title equals:Expected: Web Orders Login

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        //System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("login page pass!!!");
        } else {
            System.out.println("login page failed");
        }
        // 4-Enter username: Tester
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // 5-Enter password: test
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" );
        // 6-Click “Sign In” button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();


        // 7-Verify titleequals:Expected: Web Orders
        String expectedHomePageTitle="Web Orders";
        String actualHomePageTitle = driver.getTitle();
        if (actualHomePageTitle.equals(expectedHomePageTitle)) {
            System.out.println("Home page Title verification pass!!!" + actualHomePageTitle);
        } else {
            System.out.println("Home page Title verification failed" + actualHomePageTitle);
        }
        driver.quit();



    }
}
