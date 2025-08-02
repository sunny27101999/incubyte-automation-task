package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccountPage;
import pages.CustomerLoginPage;
import pages.HomePage;
import pages.MyAccountPage;

public class SignUpSteps {
    @Given("I open the Magento website")
    public void iOpenTheMagentoWebsite() {
        HomePage.navigateToMagentoWebsite();
    }


    @When("I navigate to the Create Account page")
    public void iNavigateToTheCreateAccountPage() {
        HomePage.clickOnCreateAccountLink();

    }
    
    @Then("I am able to see Create New Customer Account Header")
    public void iAmAbleToSeeCreateNewCustomerAccountHeader() {
        CreateAccountPage.waitForCreateAccountPageHeader();
        CreateAccountPage.verifyCreateAccountPageHeader();
    }

    @And("I enter firstName {string} and lastName {string}")
    public void iEnterFirstNameAndLastName(String firstName, String lastName) {
        CreateAccountPage.enterFirstName(firstName);
        CreateAccountPage.enterLastName(lastName);

    }
    @And("I enter email {string} and password {string}")
    public void iEnterEmailAndPassword(String email, String password) {
        CreateAccountPage.enterEmail(email);
        CreateAccountPage.enterPassword(password);
        CreateAccountPage.enterConfirmPassword(password);
    }

    @And("I submit the registration form")
    public void iSubmitTheRegistrationForm() {
        CreateAccountPage.clickOnCreateAnAccountButton();
    }
    @Then("I should see a message confirming my registration")
    public void iShouldSeeAMessageConfirmingMyRegistration() {
        MyAccountPage.waitForThankYouMessage();
        MyAccountPage.verifyThankYouMessage();
    }

    @Then("I navigate to the My Account page")
    public void iNavigateToTheMyAccountPage() {
        MyAccountPage.waitForMyAccountPageHeader();
        MyAccountPage.verifyMyAccountPageHeader();
    }


    @Then("I should see Welcome with firstName {string} and lastName {string}")
    public void iShouldSeeWelcomeWithFirstNameAndLastName(String firstName, String lastName) {
        MyAccountPage.verifyWelcomeMessageWithName(firstName,lastName);
    }



    @When("I sign out for application")
    public void iSignOutForApplication() {
        MyAccountPage.signOut();
    }
    @Then("I should see home Page header")
    public void iShouldSeeHomePageHeader() {
        HomePage.waitForHomePageHeader();
        HomePage.verifyHomePageHeader();
    }

    @When("I navigate to the Sign In page")
    public void iNavigateToTheSignInPage() {
        HomePage.clickOnSignInLink();
    }

    @Then("I am able to see Customer Login Header")
    public void iAmAbleToSeeCustomerLoginHeader() {
        CustomerLoginPage.waitForCustomerLoginHeader();
        CustomerLoginPage.verifyCustomerLoginHeader();
    }

    @And("I enter email {string} and password {string} in Customer Login Page")
    public void iEnterEmailAndPasswordInCustomerLoginPage(String email, String password) {
        CustomerLoginPage.enterEmail(email);
        CustomerLoginPage.enterPassword(password);
    }

    @And("I submit the Sign In From")
    public void iSubmitTheSignInFrom() {
        CustomerLoginPage.clickOnSignInButtonButton();
    }
}
