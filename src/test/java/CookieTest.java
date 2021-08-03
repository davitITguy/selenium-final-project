import com.gargoylesoftware.htmlunit.BrowserVersion;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CookieTest {

    @Test
    public void Cookies(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");


        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/form/input[1]"));
        login.sendKeys("Name");
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/form/input[2]"));
        password.sendKeys("password");
        WebElement enter = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
        enter.click();

        driver.navigate().refresh();
        System.out.println(driver.manage().getCookies());

        driver.manage().deleteCookieNamed("Selenium");

        System.out.println(driver.manage().getCookies());
    }

}
