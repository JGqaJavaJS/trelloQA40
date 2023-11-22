package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    static WebDriver driver;

    public static void init() {
        driver = new ChromeDriver();
        driver.navigate().to("https://trello.com/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public static void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
