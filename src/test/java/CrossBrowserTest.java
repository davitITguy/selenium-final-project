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

public class CrossBrowserTest {
    WebDriver driver;

    @BeforeTest
    @Parameters("browser")


    public void UniTDriverTest(String browser) throws Exception {
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new HtmlUnitDriver(BrowserVersion.CHROME, true);

        } else if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new HtmlUnitDriver(BrowserVersion.FIREFOX, true);
        } else
            throw new Exception("Browser is not correct");


    }

    @Test
    public void uploader() {
        String url = "http://the-internet.herokuapp.com/upload";
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement uploadBtn = driver.findElement(By.id("file-upload"));
        uploadBtn.sendKeys("C:\\Users\\DESKTOP.GE\\Desktop\\Davit spanderashvili latex cv(En).pdf");
        WebElement submitBtn = driver.findElement(By.id("file-submit"));
        submitBtn.click();
        System.out.println("Test Finished 1");


    }
}
