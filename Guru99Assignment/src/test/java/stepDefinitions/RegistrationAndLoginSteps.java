package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;
import utilities.BrowserDriver;

import static org.testng.Assert.assertEquals;

public class RegistrationAndLoginSteps extends BrowserDriver {

    @Given("the user is on the registration page")
    public void theUserIsOnTheRegistrationPage() {
        SignInPage.clickRegistrationButton();
    }

    @When("the user enters their valid details and submits the registration form")
    public void the_user_enters_their_valid_details_and_submits_the_registration_form() {
        RegistrationPage.UserRegistrationData();
    }

    @Then("the user should be redirected to the login page")
    public void theUserShouldBeRedirectedToTheLoginPage() {
        SignInPage.redirectToLoginPage();
        String title = HomePage.getLoginPageTitle();
        assertEquals(title, "Insurance Broker System - Login");
        BrowserDriver.quitBrowser();
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        SignInPage.redirectToLoginPage();
        String title = HomePage.getLoginPageTitle();
        assertEquals(title, "Insurance Broker System - Login");
    }

    @When("the user enters valid credentials and submits the login form")
    public void theUserEntersValidCredentialsAndSubmitsTheLoginForm() {
        SignInPage.sendKeys_email();
        SignInPage.sendKeys_password();
        SignInPage.clickLoginButton();
    }

    @Then("the user should be successfully logged in and see the dashboard")
    public void theUserShouldBeSuccessfullyLoggedInAndSeeTheDashboard() {
        SignInPage.redirectToLoginPage();
        String title = HomePage.getLoginPageTitle();
        assertEquals(title, "Insurance Broker System");

    }

    @And("the user should be able to logout from the page successfully")
    public void theUserShouldBeAbleToLogoutFromThePageSuccessfully() {
        RegistrationPage.setLogOutAccountButton();
    }

    @Then("the user should be redirected back to the login page after logout")
    public void theUserShouldBeRedirectedBackToTheLoginPageAfterLogout() {
        SignInPage.redirectToLoginPage();
        String title = HomePage.getLoginPageTitle();
        assertEquals(title, "Insurance Broker System - Login");
        BrowserDriver.quitBrowser();
    }

    @Given("the user has navigated to the login page")
    public void theUserHasNavigatedToTheLoginPage() {
        SignInPage.redirectToLoginPage();
        String title = HomePage.getLoginPageTitle();
        assertEquals(title, "Insurance Broker System - Login");
    }

    @When("the user enters invalid credentials and submits the login form")
    public void theUserEntersInvalidCredentialsAndSubmitsTheLoginForm() {
        SignInPage.invalidSendKeys_email();
        SignInPage.invalidSendKeys_password();
        SignInPage.clickLoginButton();
    }

    @And("the user should remain on the login page")
    public void theUserShouldRemainOnTheLoginPage() {
        SignInPage.redirectToLoginPage();
        String title = HomePage.getLoginPageTitle();
        assertEquals(title, "Insurance Broker System - Login");
        BrowserDriver.quitBrowser();
    }
}
