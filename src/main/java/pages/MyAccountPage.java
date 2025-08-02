package pages;

import Drivers.WebElementDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends HomePage{

    public static  By  thankYouMessage = WebElementDriver.findElement(By.xpath("//div[@data-bind and text()='Thank you for registering with Main Website Store.']"));
    public static By myAccountPageHeader = WebElementDriver.findElement(By.xpath("//h1/span[text()='My Account']"));
    public static By actionSwitch = WebElementDriver.findElement(By.xpath("(//button[@class='action switch'])[1]"));
    public static By signOutButton = WebElementDriver.findElement(By.xpath("(//li/a[contains(text(),'Sign Out')])[1]"));


    public static void waitForThankYouMessage(){
        waitTillClickable(thankYouMessage);
    }

    public static void verifyThankYouMessage(){
        if(!isDisplayed(thankYouMessage)){
            throw new AssertionError("Page not loaded");
        }
    }
    public static void waitForMyAccountPageHeader(){
        waitTillClickable(myAccountPageHeader);
    }

    public static void verifyMyAccountPageHeader(){
        if(!isDisplayed(myAccountPageHeader)){
            throw new AssertionError("Page not loaded");
        }
    }
    public static void verifyWelcomeMessageWithName(String firstName, String lastName){
        String name = firstName+ " "+ lastName;
        waitTillClickable(By.xpath("//li[@class='greet welcome']/span[contains(text(),'"+name+"')]"));
        if(!isDisplayed(By.xpath("//li[@class='greet welcome']/span[contains(text(),'"+name+"')]"))){
            throw new AssertionError("Page not loaded");
        }
    }
    public static void signOut(){
        click(actionSwitch);
        click(signOutButton);
    }
}
