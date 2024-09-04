package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignInPage;
import utilities.BrowserDriver;

public class QuoteRequestSteps extends BrowserDriver {

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        SignInPage.sendKeys_email();
        SignInPage.sendKeys_password();
        SignInPage.clickLoginButton();
    }

    @When("the user should able to select the Request Quotation")
    public void theUserShouldAbleToSelectTheRequestQuotation() {
        HomePage.userSelectQuoteButton();

    }

    @Then("the user should able to fill the Required fields")
    public void theUserShouldAbleToFillTheRequiredFields() throws InterruptedException {
        HomePage.userQuoteData();

    }

    @And("the user should be able get the Request Quotation data")
    public void theUserShouldBeAbleGetTheRequestQuotationData() {
        HomePage.UserIdentificationNumber();
        BrowserDriver.quitBrowser();
    }

    @Given("user Navigate to the home page")
    public void iNavigateToTheHomePage() {
        driver.navigate().to("https://demo.guru99.com/insurance/v1/index.php");
    }

    @When("user Login with Valid credentials")
    public void iLoginWithValidCredentials() {
        SignInPage.sendKeys_email();
        SignInPage.sendKeys_password();
        SignInPage.clickLoginButton();
    }

    @Then("user Verify existing quote is successfully retrieved")
    public void iVerifyExistingQuoteIsSuccessfullyRetrieved() {
        HomePage.RetrieveQuotation();
    }

    @And("user verify user id quote details")
    public void iVerifyQuoteDetails() {
        HomePage.RetrieveQuotationData();
        BrowserDriver.quitBrowser();

    }
}
