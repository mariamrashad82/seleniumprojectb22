package mariamPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CyberTek_day1 {
    public static void main(String[] args) {
       //TC #2: Cybertekpractice toolverifications
// 1.Open Chrome browser
// 2.Go to https://practice.cybertekschool.com
// 3.Verify URL containsExpected: cybertekschool
// 4.Verify title: Expected: Practice
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.get(" https://practice.cybertekschool.com");
        String url = driver.getCurrentUrl();
         String expectedTitle = "cybertekschool";
         String verifyTitle = "practice";

         if(url.contains(expectedTitle)&&url.contains(verifyTitle)){
             System.out.println("Title pass");
         }else{
             System.out.println("Title failed");
         }



    }
}
