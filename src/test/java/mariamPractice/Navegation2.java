package mariamPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegation2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.get("https://www.tesla.com");
        System.out.println("Current title = "+ driver.getTitle());
        String currentUrlTitle = driver.getCurrentUrl();
        System.out.println("currentUrlTitle = " + currentUrlTitle);
    }
}
