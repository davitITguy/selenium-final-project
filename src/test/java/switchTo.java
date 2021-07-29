import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class switchTo {

   /* public void URLRefacto(String){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/iframe";
        driver.get(url);
    }  */

    @Test
    public void SwitchHW() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/iframe";
        driver.get(url);
        driver.switchTo().frame("mce_0_ifr");
        WebElement IframeInput = driver.findElement(By.tagName("p"));
        IframeInput.clear();
        IframeInput.sendKeys("Here Goes");
        driver.switchTo().parentFrame();
        WebElement TextAlign = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[4]/button[2]"));
        TextAlign.click();
    }
    @Test
    public void HandleAlert(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/alerts";
        driver.get(url);
        WebElement AlertSelector = driver.findElement(By.id("alertButton"));
        AlertSelector.click();
        driver.switchTo().alert().accept();

    }

}
