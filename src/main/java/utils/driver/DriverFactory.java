package utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.PropertyManager;

import java.util.concurrent.TimeUnit;

/**
 * Created by Diana on 13.04.2017.
 */
public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (PropertyManager.getBrowserType()) {
                case FIREFOX:
                    driver = new FirefoxDriver();
                    break;
                case CHROME:
                    driver = new ChromeDriver();
                    break;
                case EXPLORER:
                    driver = new InternetExplorerDriver();
                    break;
            }

            setTimeOuts();
        }
        return driver;
    }

    public static WebDriver setTimeOuts() {
        driver.manage().timeouts().implicitlyWait(PropertyManager.getImplicitWait(), TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

}
