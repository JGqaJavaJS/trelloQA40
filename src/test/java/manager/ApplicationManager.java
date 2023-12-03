package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    static EventFiringWebDriver driver;

    public static void init() {
        driver = new EventFiringWebDriver(new ChromeDriver());
        navigateToMainPage();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.register(new WDListener());
    }

    public static void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void navigateToMainPage() {
        driver.navigate().to("https://trello.com/home");
    }

}
