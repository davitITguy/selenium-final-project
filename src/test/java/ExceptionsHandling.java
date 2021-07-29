import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.pool.TypePool;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class ExceptionsHandling {




    @Test
    public void DatePicker () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://jqueryui.com/datepicker/";
        driver.get(url);

        try {
            driver.switchTo().frame(0);
            WebElement DtPick = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
            DtPick.click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            WebElement prevBtn = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]"));
            prevBtn.click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            WebElement lastDate = driver.findElement(By.cssSelector("a:last-child"));
        } catch (NoSuchFrameException e){

        }



    }

    @Test
    public void WaitedAlert() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://demoqa.com/alerts ";
        driver.get(url);



        try {
            WebElement waitedAlert = driver.findElement(By.id("timerAlertButton"));
            waitedAlert.click();
            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            driver.switchTo().alert().accept();

        }catch (NoAlertPresentException e){

        }
    }
}

