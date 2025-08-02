package pages;

import Drivers.PageObject;
import Drivers.WebElementDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject{

    static By createAccountLink = WebElementDriver.findElement(By.xpath("(//a[text()='Create an Account'])[1]"));
    static By homePageHeader = WebElementDriver.findElement(By.xpath("//h1/span[text()='Home Page']"));
    static By signInLink = WebElementDriver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]"));

    public static void navigateToMagentoWebsite(){
        open("https://magento.softwaretestingboard.com/");
    }
    public static void clickOnCreateAccountLink(){
        waitTillClickable(createAccountLink);
        click(createAccountLink);
    }
    public static void waitForHomePageHeader(){
        waitTillClickable(homePageHeader);
    }

    public static void verifyHomePageHeader(){
        if(!isDisplayed(homePageHeader)){
            throw new AssertionError("Page not loaded");
        }
    }
    public static void clickOnSignInLink(){
        click(signInLink);
    }
}
