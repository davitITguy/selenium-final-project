import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.pool.TypePool;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class WebTablesTest {

    public class Tables {
        WebDriver driver;

        public Tables() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        @Test
        public void handleStaticTable() {
            driver.get("http://techcanvass.com/Examples/webtable.html");
            driver.manage().window().maximize();
            System.out.println(driver.findElement(By.xpath("//*[@id='t01']/tbody/tr[1]/th[1]")).getText());

            for (int rowno = 1; rowno <= 4; rowno++) {
                for (int colno = 1; colno <= 4; colno++) {
                    System.out.println(driver.findElement(By.xpath("//*[@id='t01']/tbody/tr[" + rowno + "]/td[" + colno + "]")).getText());

                }
            }
        }
    }
}
