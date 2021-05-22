package day4_ClassSelector_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CssSelector_CyberTek {
    public static void main(String[] args) throws InterruptedException {
        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/forgot_password
        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        //b. “Forgot password” header
        //c. “E-mail” text
        //d. E-mail input box
        //e. “Retrieve password” button
        //f. “Powered by Cybertek School” text
        //4. Verify all WebElements are displayed.

        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");



        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link

       /// WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //b. “Forgot password” header
        WebElement forgetPasswordHeader = driver.findElement(By.tagName("h2"));

        //c. “E-mail” text
        WebElement E_mailText = driver.findElement(By.cssSelector("label[for='email']"));

        //d. E-mail input box
        WebElement E_mailInput = driver.findElement(By.cssSelector("input[name='email']"));

        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));

        //f. “Powered by Cybertek School” text
        WebElement PoweredByCyberTekSchool = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //4. Verify all WebElements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println( "forgetPasswordHeader.isDisplayed() = "+forgetPasswordHeader.isDisplayed() );
        System.out.println("E_mailText.isDisplayed() = "+ E_mailText.isDisplayed());
        System.out.println("E_mailInput.isDisplayed() = " + E_mailInput.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = "+ retrievePassword.isDisplayed());
        System.out.println("PoweredByCyberTekSchool.isDisplayed() =  "+ PoweredByCyberTekSchool.isDisplayed());
















    }
}
