package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.driver.DriverFactory;

/**
 * Created by Diana on 13.04.2017.
 */
public class AbstractTestCase {

    @BeforeClass
    public void openAdminPage() {
        DriverFactory.getDriver();
    }

    @AfterClass
    public void quitBrowser() {
        DriverFactory.closeDriver();
    }

    //TODO: в проперти прописать бейз урлл и доставать от туда
    //TODO: відрефакторити тест кейси
    //TODO: для урли написати енум, 3 урли і зчитувати урлу.
    //TODO: нові тест кейси для нових сторінок з використанням вейтів
}