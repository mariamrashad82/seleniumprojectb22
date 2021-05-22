package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
//TC #2: Zero Bank link text verification
//1. Open Chrome browser
//2. Go to http://zero.webappsecurity.com/login.html
//3. Verify link text from top left:
//Expected: “Zero Bank”
//4. Verify link href attribute value contains:
//Expected: “index.html”


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        //locate the element and store
         WebElement zeroBankLink = driver.findElement(By.className("brand"));


        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("Link passed");
        }else{
            System.out.println("Link Faild");
        }
    //4. Verify link href attribute value contains:
    //Expected: “index.html”
        String expectedInHrefValue = "index.html";
        String actualHerValue = zeroBankLink.getAttribute("href");
        if(actualHerValue.contains(expectedInHrefValue)){
            System.out.println("HREF value passed!!");
        }else{
            System.out.println("HREF value Failed!!");
        }

    }
}
