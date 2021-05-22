package mariamPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//TC #1: YahooTitle Verification
// 1.Open Chrome browser
// 2.Go to https://www.yahoo.com
// 3.Verify title: Expected: Yahoo

public class Yahoo_day1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        driver.get("https://www.yahoo.com");
        Thread.sleep(2000);

        String expectedTitle ="Yahoo";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title pass");
        }else{
            System.out.println("title failed");
        }
        driver.close();

    }

}
