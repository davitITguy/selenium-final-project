import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

        // Below is not finished

            // Ask irakli or nika what is Below
//        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='checkboxes']"));
//        for (WebElement tempEle : elements) {
//
//            tempEle.click();
//            System.out.println("Temple Clicked");
//
//        }
        // Ask irakli or nika what is Above
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebDriverWait wait = new WebDriverWait(driver, 2);
//        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        elements.forEach(e -> {
//            if (!e.isSelected()) {
//                js.executeScript("document.getElementById('checkbox').checked=true;");
//                System.out.println("I checked true");
//            }
//        });
        List<WebElement> checkList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkList.size()+"IM SIZE");
        for (int i=0 ; i < checkList.size() ; i ++){
            if (checkList.get(i).isSelected()==false){
                checkList.get(i).click();
                System.out.println("I did it");
            }
        }

        //MAIN CODE|||||||||||||||||
//        WebElement[] CheckboxesList = {driver.findElement(By.xpath("//div[@id='checkboxes']")) };
//        for (int i = 0 ; i < CheckboxesList.length ; i++){
//            System.out.println("I was Here"+ i);
//            if(!CheckboxesList[i].isSelected()) {
//                System.out.println("im inside IF"+i);
//
//            }
//        }
        //Above is not finished
        WebElement YellowPicker = driver.findElement(By.xpath("//input[@value='yellow']"));
        YellowPicker.click();

        WebElement EDChecker = driver.findElement(By.xpath("//option[@value='orange'][@disabled='disabled']"));
        if(!EDChecker.isEnabled()){
            System.out.println("Test Complete");
        }else System.out.println("Test Failed");

        }
    }

