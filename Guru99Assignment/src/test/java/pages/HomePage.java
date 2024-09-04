package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.BrowserDriver.driver;

public class HomePage {
    public static String getLoginPageTitle() {
        driver.getTitle();
        return driver.getTitle();
    }

    public static String requestQuote = "(//a[@class='ui-tabs-anchor'])[2]";
    public static String selectBreakdownCoverage = "//*[@id='quotation_breakdowncover']";
    public static String selectRoadSide = "//*[@id='quotation_breakdowncover']/option[2]";
    public static String enterIncidents = "//input[@id = 'quotation_incidents']";
    public static String enterRegistration = "//input[@id = 'quotation_vehicle_attributes_registration']";
    public static String enterAnnualMileage = "//input[@id = 'quotation_vehicle_attributes_mileage']";
    public static String enterEstimatedValue = "//input[@id = 'quotation_vehicle_attributes_value']";
    public static String enterParkingLocation = "//*[@id='quotation_vehicle_attributes_parkinglocation']/option[4]";
    public static String enterSubmitButton = "(//input[@type = 'submit'])[2]";
    public static String retrieveQuotation = "//*[@id='ui-id-3']";
    public static String sendRetrieveQuotation = "//*[@id='tabs-3']/form/input[1]";
    public static String submitRetrieveQuotation = "//input[@value = 'Retrieve']";

    public static void userSelectQuoteButton() {
        driver.findElement(By.xpath(requestQuote)).click();
    }

    public static void userQuoteData() throws InterruptedException {
        driver.findElement(By.xpath(selectBreakdownCoverage)).click();
        driver.findElement(By.xpath(selectRoadSide)).click();
        driver.findElement(By.xpath(enterIncidents)).sendKeys("Accident");
        driver.findElement(By.xpath(enterRegistration)).sendKeys("1561651651651");
        driver.findElement(By.xpath(enterAnnualMileage)).sendKeys("45");
        driver.findElement(By.xpath(enterEstimatedValue)).sendKeys("5000");
        driver.findElement(By.xpath(enterParkingLocation)).click();
        driver.findElement(By.xpath(enterSubmitButton)).click();
        Thread.sleep(1000);
    }

    public static void RetrieveQuotation() {
        driver.findElement(By.xpath(retrieveQuotation)).click();
        driver.findElement(By.xpath(sendRetrieveQuotation)).sendKeys("37471");
        driver.findElement(By.xpath(submitRetrieveQuotation)).click();
    }

    public static void RetrieveQuotationData() {
        WebElement insuranceUserId = driver.findElement(By.xpath("//table//tr[4]/td[2]")); // Modify XPath as needed
        String actualName = insuranceUserId.getText();
        Assert.assertEquals("81451", actualName);
    }

    public static void UserIdentificationNumber() {
        WebElement identificationNumber = driver.findElement(By.xpath("/html/body/b[2]")); // Modify XPath as needed
        String actualName = identificationNumber.getText();
        Assert.assertEquals("Your identification number is :", actualName);
    }

}

