import com.gargoylesoftware.htmlunit.BrowserVersion;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.security.Key;

public class seleniumFinalProject {


    WebDriver driver =  null;
    @BeforeTest
    @Parameters("browserName")
    public void setup(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("FireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
    }

    @Test
    public void seleniumFinalProject() throws InterruptedException {


        driver.get("http://tutorialsninja.com/demo/");

        WebElement RegisterClicker = driver.findElement(By.xpath("//li[@class='dropdown']"));
        RegisterClicker.click();

        RegisterClicker = driver.findElement(By.xpath("//a[text()='Register']"));
        RegisterClicker.click();
        // With Class
        WebElement FormFiller = driver.findElement(By.xpath("//input[@class='form-control']"));
        FormFiller.sendKeys("Davit");
        // With Name
        FormFiller = driver.findElement(By.xpath("//input[@name='lastname']"));
        FormFiller.sendKeys("Spanderashvili");
        // With Type
        int a;
        a = (int) Math.random();
        FormFiller = driver.findElement(By.xpath("//input[@type='email']"));
        FormFiller.sendKeys("DavitSpanderashvili@TBCBank.ge");
        // With ID
        FormFiller = driver.findElement(By.id("input-telephone"));
        FormFiller.sendKeys("558499400");
        // With Placeholder
        FormFiller = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        FormFiller.sendKeys("MostAwesomePass1");
        // With Name
        FormFiller = driver.findElement(By.xpath("//input[@name=\"confirm\"]"));
        FormFiller.sendKeys("MostAwesomePass1");
        // With className prop
        FormFiller = driver.findElement(By.className("radio-inline"));
        FormFiller.click();
        // Agree On Policy
        FormFiller = driver.findElement(By.xpath("//input[@name='agree']"));
        FormFiller.click();

        Thread.sleep(5000);
        // With Type
        FormFiller = driver.findElement(By.xpath("//input[@type='submit']"));
        FormFiller.click();

        Thread.sleep(5);

        FormFiller = driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));
        FormFiller.click();

        FormFiller = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
        FormFiller.click();

        WebElement MP3Handler = driver.findElement(By.xpath("//a[text()='MP3 Players (4)']"));
        MP3Handler.click();


        String actualTooltipTxt = "iPod Shuffle";
        MP3Handler = driver.findElement(By.xpath("//a[text()='iPod Shuffle']"));
        MP3Handler.getAttribute("title");
//        Assert.assertEquals(actualTooltipTxt, MP3Handler);
        MP3Handler.click();

        MP3Handler = driver.findElement(By.xpath("//img[@title='iPod Shuffle']"));
        MP3Handler.click();


        System.out.println(MP3Handler.getSize());

        MP3Handler = driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']"));
        for (int i = 0 ; i < 5 ; i++){

            Thread.sleep(1000);
            MP3Handler.click();
            int k = i;
            k++;
            System.out.println("We are at "+k+" Img");
        }
        MP3Handler.sendKeys(Keys.ESCAPE);

        MP3Handler = driver.findElement(By.xpath("//a[text()='Reviews (0)']"));
        MP3Handler.click();

        MP3Handler = driver.findElement(By.xpath("//input[@name='name']"));
        MP3Handler.sendKeys("Davit Spanderashvili");

        MP3Handler = driver.findElement(By.xpath("//textarea[@id='input-review']"));
        MP3Handler.sendKeys("iPod made a huge impact on music industry but its days of glory are over");

//        MP3Handler = driver.findElement(By.xpath("//button[@id='button-cart']"));
//        MP3Handler.click();

        WebElement BillingFiller = driver.findElement(By.xpath("//input[@type='radio']"));
        BillingFiller.click();
        Thread.sleep(1000);
        BillingFiller = driver.findElement(By.xpath("//button[@id='button-review']"));
        BillingFiller.click();

        BillingFiller = driver.findElement(By.xpath("//button[@id='button-cart']"));
        BillingFiller.click();


        Thread.sleep(1000);
        MP3Handler = driver.findElement(By.xpath("//span[@id='cart-total']"));
        String ItemChecker = MP3Handler.getText();
        ItemChecker.trim();
        System.out.println(ItemChecker);

        MP3Handler = driver.findElement(By.xpath("//a[@href=\"http://tutorialsninja.com/demo/index.php?route=checkout/checkout\"]"));
        MP3Handler.click();

        Thread.sleep(2000);

//        BillingFiller = driver.findElement(By.xpath("//a[@href='#collapse-shipping']"));
//        BillingFiller.click();


        WebDriverWait wait=new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));

        FormFiller = driver.findElement(By.xpath("//input[@name='email']"));
        FormFiller.sendKeys("DavitSpanderashvili@TBCBank.ge");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));

        FormFiller = driver.findElement(By.xpath("//input[@name='password']"));
        FormFiller.sendKeys("MostAwesomePass1");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='button-login']")));

        FormFiller = driver.findElement(By.xpath("//input[@id='button-login']"));
        FormFiller.click();

//        BillingFiller = driver.findElement(By.xpath("//select"));
//        Thread.sleep(1000);
//        BillingFiller.click();
//        BillingFiller.sendKeys("GEORGIA");
//        BillingFiller.click();
//
//
//        BillingFiller = driver.findElement(By.xpath("//select[@name='zone_id']"));
//        Thread.sleep(1000);
//        BillingFiller.click();
//        BillingFiller.sendKeys("TBILISI");
//        BillingFiller.click();
//
//        BillingFiller = driver.findElement(By.xpath("//a[text()='Continue Shopping']"));
//        BillingFiller.click();
//
//
/////////////////////////////////////////////////////////////////////////
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-payment-firstname")));
//        WebElement billingFirstname = driver.findElement(By.id("input-payment-firstname"));



        }





    }

