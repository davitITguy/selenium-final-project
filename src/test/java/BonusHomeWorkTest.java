import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BonusHomeWorkTest {
    @Test
    public void BonusHomeWorkTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com/");

        Thread.sleep(3000);
        WebElement Number = driver.findElement(By.xpath("//input[@type=\"text\" and @class=\"_2IX_2- VJZDxU\"]"));
        Number.sendKeys("558499400");
        WebElement Password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        Password.sendKeys("MostAwesomePass");
        WebElement Submit = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\" and @type=\"submit\"]"));
        Submit.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"_2YULOR\"]")));
        WebElement InvalidText = driver.findElement(By.xpath("//span[@class=\"_2YULOR\"]"));
        System.out.println(InvalidText.getText()
        );
    }
}
