package pages;

import Drivers.WebElementDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends HomePage {

    static By createAccountPageHeader = WebElementDriver.findElement(By.xpath("//h1/span[text()='Create New Customer Account']"));
    static By firstNameField = WebElementDriver.findElement(By.id("firstname"));
    static By lastNameField = WebElementDriver.findElement(By.id("lastname"));
    static By emailField = WebElementDriver.findElement(By.id("email_address"));
    static By passwordField = WebElementDriver.findElement(By.id("password"));
    static By  confirmPasswordField = WebElementDriver.findElement(By.id("password-confirmation"));
    static By createAnAccountButton = WebElementDriver.findElement(By.xpath("//span[text()='Create an Account']/ancestor::button"));


     public static void waitForCreateAccountPageHeader(){
         waitTillClickable(createAccountPageHeader);
     }

    public static void verifyCreateAccountPageHeader(){
        if(!isDisplayed(createAccountPageHeader)){
            throw new AssertionError("Page not loaded");
        }
    }
    public static void enterFirstName(String firstName){
         typeInto(firstNameField,firstName);
    }
    public static void enterLastName(String lastName){
        typeInto(lastNameField,lastName);
    }
    public static void enterEmail(String email){
        scrollToBottom();
        typeInto(emailField,email);
    }
    public static void enterPassword(String password){
        typeInto(passwordField,password);
    }
    public static void enterConfirmPassword(String password){
        typeInto(confirmPasswordField,password);
    }
    public static void clickOnCreateAnAccountButton(){
       click(createAnAccountButton);
    }
}
