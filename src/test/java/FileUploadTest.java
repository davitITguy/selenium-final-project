package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FileUploadTest {
//    WebDriver driver;
//
//    public FileUploadTest() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
////        ქვედა კოდი ვნახე და არ მუშაობს და სწორი მიდგომაა ან რატო არ მუშაობს?
////        public readonly By _uploadFilesLocator = By.xpath("http://the-internet.herokuapp.com/upload");
//    }

    @Test
    public void uploader() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://the-internet.herokuapp.com/upload";
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement uploadBtn = driver.findElement(By.id("file-upload"));
        uploadBtn.sendKeys("C:\\Users\\DESKTOP.GE\\Desktop\\Davit spanderashvili latex cv(En).pdf");
        WebElement submitBtn = driver.findElement(By.id("file-submit"));
        submitBtn.click();

    }

    @Test
    public void hoverMagicEffects() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://webdriveruniversity.com/To-Do-List/index.html";
        driver.get(url);

        WebElement hover = driver.findElement(By.xpath("/html/body/div/ul/li[3]"));
        hover.click();
        hover.getAttribute("title");
        Actions builder = new Actions (driver);
        JavascriptExecutor js= (JavascriptExecutor)driver;
        builder.clickAndHold().moveToElement(hover).perform();

        WebElement toolTipElement = driver.findElement(By.xpath("/html/body/div/ul/li[3]/span"));
        js.executeScript("arguments[0].click();", toolTipElement);
        toolTipElement.click();
    }

    @Test
    public void PlayWithMouse () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://webdriveruniversity.com/Scrolling/index.html";
        driver.get(url);
        WebElement target = driver.findElement(By.id("zone1"));
        int xOffset=0;
        int yOffset=0;
        Actions builder = new Actions (driver);
        JavascriptExecutor js= (JavascriptExecutor)driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        builder.moveToElement(target);
        driver.quit();
    }


//    @Test
//    public void handleTooltipWithClickAndHold() {
//        driver.manage().window().maximize();
//        driver.get("http://demo.guru99.com/test/tooltip.html");
//        String expectedTooltip = "What's new in 3.2";
//        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
//        Actions builder = new Actions (driver);
//        builder.clickAndHold().moveToElement(download).perform();
//        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
//        String actualTooltip = toolTipElement.getText();
//
//        System.out.println("Actual Title of Tool Tip  "+actualTooltip);
//        if(actualTooltip.equals(expectedTooltip)) {
//            System.out.println("Test Case Passed");
//        }
//    }


//    @Test
//    public void uploadWithRobot() throws InterruptedException, AWTException {
//
//        driver.manage().window().maximize(); // maximizing window
//        driver.get("http://the-internet.herokuapp.com/upload");//open testing website
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// for Implicit wait
//
////        JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll operation using Js Executor
////        js.executeScript("window.scrollBy(100,376)"); // Scroll Down(+ve) up to browse option
////        Thread.sleep(5000); // suspending execution for specified time period
////        // Click როგორ გამოვიყენო?
//
//        WebElement browse = driver.findElement(By.id("file-upload"));
//        // using linkText, to click on browse element
//        browse.sendKeys("Davit spanderashvili latex cv(En).pdf"); // Click on browse option on the webpage
//        System.out.println(browse.toString());
//        Thread.sleep(5000); // suspending execution for specified time period
//        browse.findElement(By.id("file-submit"));
//        browse.click();
//
////        // creating object of Robot class
////        Robot rb = new Robot();
////
////        // copying File path to Clipboard
////        StringSelection str = new StringSelection("C:\\Users\\DESKTOP.GE\\Desktop\\Davit spanderashvili latex cv(En).pdf");
////        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
////
////        // press Contol+V for pasting
////        rb.keyPress(KeyEvent.VK_WINDOWS);
////        rb.keyPress(KeyEvent.VK_V);
////
////        // Press Enter for choosing
////        rb.keyPress(KeyEvent.VK_ENTER);
////
////        // release Contol+V for pasting
////        rb.keyRelease(KeyEvent.VK_WINDOWS);
////        rb.keyRelease(KeyEvent.VK_V);
////
////        // for pressing and releasing Enter
////        rb.keyPress(KeyEvent.VK_ENTER);
////        rb.keyRelease(KeyEvent.VK_ENTER);
    }


