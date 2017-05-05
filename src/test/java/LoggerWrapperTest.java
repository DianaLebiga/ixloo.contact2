import data.User;
import data.UserRepository;
import functionality.IxlooComFunctionality;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.CustomTestListener;
import utils.LoggerWrapper;
import utils.driver.DriverFactory;

/**
 * Created by Diana on 05.05.2017.
 */
@Listeners(CustomTestListener.class)
public class LoggerWrapperTest {

    private IxlooComFunctionality ixlooComFunctionality;
    private User ixlooUser = UserRepository.getIxlooUser();

    @BeforeTest
    public void logError() {
        LoggerWrapper.getLogger().error(" my error");
    }

    @Test
    public void myTest() {
        ixlooComFunctionality = new IxlooComFunctionality();
        ixlooComFunctionality.openIxlooAdminPage();
        ixlooComFunctionality.fillContactUs(ixlooUser);
    }

    @AfterTest
    public void quitBrowser() {
        DriverFactory.closeDriver();
    }
}
