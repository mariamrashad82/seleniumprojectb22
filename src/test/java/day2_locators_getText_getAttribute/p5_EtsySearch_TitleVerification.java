package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5_EtsySearch_TitleVerification {
    public static void main(String[] args) {

        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("http://www.etsy.com");

        //3. Search for “wooden spoon”
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Wooden spoon" + Keys.ENTER);

        //4. Verify title:
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        //Expected: “Wooden spoon | Etsy
        if (actualTitle.startsWith(expectedTitle)) {
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Etsy Title is passed!!!!");
            } else {
                System.out.println("Etsy Title is failed!!!");
            }

        }
    }
}
