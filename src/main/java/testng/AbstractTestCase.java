package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import utils.CustomTestListener;
import utils.driver.DriverFactory;

/**
 * Created by Diana on 13.04.2017.
 */
@Listeners(CustomTestListener.class)
public class AbstractTestCase {

    @BeforeClass
    public void openAdminPage() {
        DriverFactory.getDriver();
    }

    @AfterClass
    public void quitBrowser() {
        DriverFactory.closeDriver();
    }

}