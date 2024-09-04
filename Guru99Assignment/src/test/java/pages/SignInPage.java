package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.BrowserDriver.driver;


public class SignInPage {

    public static String email_text_path = "//input[@id ='email']";
    public static String password_text_path = "//input[@id ='password']";
    public static String login_button_path = "//input[@type ='submit']";
    public static String registration_button_path = "//a[text()='Register']";
    public static String error_message_path = "//*[@id=\"login-form\"]/div[2]/span/b";

    public static void sendKeys_email() {
        driver.findElement(By.xpath(email_text_path)).sendKeys("kalebu434@gmail.com");

    }

    public static void sendKeys_password() {
        driver.findElement(By.xpath(password_text_path)).sendKeys("Kalebu@123");

    }

    public static void clickLoginButton() {
        driver.findElement(By.xpath(login_button_path)).click();

    }

    public static void clickRegistrationButton() {
        driver.findElement(By.xpath(registration_button_path)).click();

    }

    public static void invalidSendKeys_email() {
        driver.findElement(By.xpath(email_text_path)).sendKeys("hello@gmail.com");

    }

    public static void invalidSendKeys_password() {
        driver.findElement(By.xpath(password_text_path)).sendKeys("lkdflnv@123");

    }

    public static void redirectToLoginPage() {
        driver.getCurrentUrl();
    }

    public static void verifyInvalidLoginErrorMessage() {

    }

}


