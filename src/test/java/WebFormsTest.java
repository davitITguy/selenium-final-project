import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebFormsTest {

    @Test
    public void WebFormsTest (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
        driver.get(url);

        WebElement LanguagePicker = driver.findElement(By.xpath("//select/option[@value='c#']"));
        LanguagePicker.click();
        LanguagePicker = driver.findElement(By.xpath("//option[@value='maven']"));
        LanguagePicker.click();
        LanguagePicker = driver.findElement(By.xpath("//option[@value='css']"));
        LanguagePicker.click();
        WebElement ChB = null;
        List<WebElement> CheckboxesList = driver.findElements(By.xpath("//div[@id='checkboxes']"));

        for (int i = 0 ; i < CheckboxesList.size() ; i++){
            ChB = CheckboxesList.get(i);

            if(ChB.isSelected() == false) {
                ChB.click();
            }
        }

        }
    }

