import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitsTest {
    @Test
    public void WaitsTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/progress-bar";
        driver.get(url);

        WebElement waiter = driver.findElement(By.id("startStopButton"));
        waiter.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
