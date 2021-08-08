import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebElements {

    @Test
    public void webElems() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/add_remove_elements/";
        driver.get(url);

        WebElement DltElem = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        for (int i=0 ; i < 3 ; i ++) {
            DltElem.click();
        }
        // Finding Last Delete Btn Part 1
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement LastSamurai = driver.findElement(By.xpath("//button[@class=\"added-manually\"][last()]"));
        System.out.println(LastSamurai.getText());

        String xpath = "//button[@class=\"added-manually\"][last()]";
        String a = null;
        List<WebElement> LastSamurais = driver.findElements(By.xpath("//button[@class=\"added-manually\"][last()]"));
        for (int i = 0; i < LastSamurais.size(); i++) {
            a = LastSamurais.get(i).toString();
            System.out.println(a);
        }
        if (a.contains(xpath)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        // Finding Last Delete Btn Part 2
    }
    @Test
    public void ChallengeDOM(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/challenging_dom";
        driver.get(url);

        WebElement Adipisci = driver.findElement(By.xpath("//td[text()=\"Adipisci9\"]"));
        System.out.println(Adipisci.getText());
        Adipisci = driver.findElement(By.xpath("//td[text()='Adipisci9']/following-sibling::td"));
        System.out.println(Adipisci.getText());
    }
}