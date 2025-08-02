package pages;

import Drivers.WebElementDriver;
import org.openqa.selenium.By;

public class CustomerLoginPage extends HomePage{
    static By customerLoginHeader = WebElementDriver.findElement(By.xpath("//h1/span[text()='Customer Login']"));
    static By emailField = WebElementDriver.findElement(By.id("email"));
    static By passwordField = WebElementDriver.findElement(By.id("pass"));
    static By signInButtonButton = WebElementDriver.findElement(By.xpath("//span[text()='Sign In']/ancestor::button"));

    public static void waitForCustomerLoginHeader(){
        waitTillClickable(customerLoginHeader);
    }

    public static void verifyCustomerLoginHeader(){
        if(!isDisplayed(customerLoginHeader)){
            throw new AssertionError("Page not loaded");
        }
    }

    public static void enterEmail(String email){
        scrollToBottom();
        typeInto(emailField,email);
    }
    public static void enterPassword(String password){
        typeInto(passwordField,password);
    }
    public static void clickOnSignInButtonButton(){
        click(signInButtonButton);
    }
}
