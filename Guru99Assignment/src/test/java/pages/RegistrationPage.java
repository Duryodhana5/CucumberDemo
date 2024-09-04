package pages;

import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;

public class RegistrationPage {

    public static String firstName = "//input[@name='firstname']";
    public static String lastName = "//input[@name='lastname']";
    public static String phoneNumber = "//input[@name='phone']";
    public static String year = "//option[@value='1947']";
    public static String months = "(//option[@value='8'])[1]";
    public static String dates = "(//option[@value='15'])[1]";
    public static String addressStreetName = "//input[@name = 'street']";
    public static String city = "//input[@name = 'city']";
    public static String country = "//input[@name = 'county']";
    public static String pinCode = "//input[@name = 'post_code']";
    public static String email = "//input[@name = 'email']";
    public static String password = "//input[@name = 'password']";
    public static String conPassword = "//input[@name = 'c_password']";
    public static String createAccountButton = "//input[@type = 'submit']";
    public static String logOutAccountButton = "//input[@value='Log out']";

    public static void UserRegistrationData() {
        driver.findElement(By.xpath(firstName)).sendKeys("Kalebu");
        driver.findElement(By.xpath(lastName)).sendKeys("dileep");
        driver.findElement(By.xpath(phoneNumber)).sendKeys("8567413518");
        driver.findElement(By.xpath(year)).click();
        driver.findElement(By.xpath(months)).click();
        driver.findElement(By.xpath(dates)).click();
        driver.findElement(By.xpath(addressStreetName)).sendKeys("Road no 4, BharathNagar");
        driver.findElement(By.xpath(city)).sendKeys("KPHB Colony");
        driver.findElement(By.xpath(country)).sendKeys("India");
        driver.findElement(By.xpath(pinCode)).sendKeys("551055");
        driver.findElement(By.xpath(email)).sendKeys("kalebu434@gmail.com");
        driver.findElement(By.xpath(password)).sendKeys("Kalebu@123");
        driver.findElement(By.xpath(conPassword)).sendKeys("Kalebu@123");
        driver.findElement(By.xpath(createAccountButton)).click();
    }

    public static void setLogOutAccountButton() {
        driver.findElement(By.xpath(logOutAccountButton)).click();
    }
}