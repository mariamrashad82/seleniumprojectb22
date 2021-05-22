package day5_findElements_checkboxe;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class P0_findElement_Practice {
    public static void main(String[] args) {
      // TC #0: FINDELEMENTS
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/forgot_password
        //3. Print out the texts of all links
        //4. Print out how many total link


        //this line from webDriverFactory_V2 another task
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();



        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // we need to creat a locator that return
        // we are stored all of the links that are return by find element method
        List<WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a"));
        //3. Print out the texts of all links
         for(WebElement each : listOfLinks){
             System.out.println(each.getText());
             System.out.println(each.getAttribute("href"));
             //4. Print out how many total link
             int numberOfLinks= listOfLinks.size();
             System.out.println("numberOfLinks = " + numberOfLinks);
         }



    }
}
