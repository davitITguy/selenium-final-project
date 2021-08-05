import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionClassTest {

    @Test
    public void ActionClassTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/slider");

        WebElement SliderMove = driver.findElement(By.xpath("//div[@id='sliderContainer']/div[1]/span[1]/input"));
           Actions action = new Actions(driver);
           action.clickAndHold(SliderMove);
           Thread.sleep(1000);
           for (int i =0 ;i <=25 ; i++){
               action.sendKeys(Keys.ARROW_RIGHT);
               Thread.sleep(200);
           }
           action.release(SliderMove);
           Thread.sleep(2000);

    }
}
