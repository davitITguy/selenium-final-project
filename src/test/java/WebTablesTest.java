import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTablesTest {

    @Test
    public void WebTablesTest (){

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    String url = "http://techcanvass.com/Examples/webtable.html";
    driver.get(url);

    WebElement CarBrand = driver.findElement(By.xpath("//table//tr[last()]//td"));
    System.out.println(CarBrand.getText());
    WebElement CarPrice = driver.findElement(By.xpath("//table//tr[last()]//td[last()]"));
    System.out.println(CarPrice.getText());

    }
}

