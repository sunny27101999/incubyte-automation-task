package Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObject {


    public static void open(String url){
        DriverManager.getDriver().navigate().to(url);
    }

    public static void click(By element){
        waitTillClickable(element);
        DriverManager.getDriver().findElement(element).click();

     }
     public static void typeInto(By element ,String text){
         waitTillClickable(element);
         DriverManager.getDriver().findElement(element).sendKeys(text);
     }
    public static void waitTillClickable( By element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static boolean isDisplayed(By element){
        return DriverManager.getDriver().findElement(element).isDisplayed();
    }
    public static void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
