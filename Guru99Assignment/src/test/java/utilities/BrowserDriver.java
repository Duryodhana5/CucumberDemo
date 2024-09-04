package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserDriver {
    public static WebDriver driver;
    public ChromeOptions options;

    public BrowserDriver() {
//        options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        System.setProperty("webdriver.https.factory", "jdk-https-client");
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/divers.chromedriver-win64/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://demo.guru99.com/insurance/v1/index.php");

//        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.safaridriver().setup();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
//        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");
    }

    public static void quitBrowser() {
        driver.quit();
    }
}


