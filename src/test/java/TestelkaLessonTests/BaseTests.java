package TestelkaLessonTests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTests {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected final String baseUrl = "http://localhost:8080";

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //, "--headless=new"
        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

//    @BeforeEach
//    public void setup() {
//        FirefoxOptions options = new FirefoxOptions();
////        options.addArguments("--remote-allow-origins=*");
////        FirefoxOptions options = new FirefoxOptions();
////        options.addArguments("-headless");
//        driver = new FirefoxDriver(options);
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}