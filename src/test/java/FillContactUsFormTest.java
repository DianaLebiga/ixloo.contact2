import data.User;
import data.UserRepository;
import functionality.IxlooComFunctionality;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testng.AbstractTestCase;

/**
 * Created by Diana on 03.04.2017.
 */
public class FillContactUsFormTest extends AbstractTestCase {

    private User ixlooUser = UserRepository.getIxlooUser();
    private User ixlooUserWithComment = UserRepository.getIxlooUserWithComment();
    private User ixlooUserNegative = UserRepository.getIxlooUserNegative();

    private IxlooComFunctionality ixlooComFunctionality;

    public static final Logger LOGGER = Logger.getLogger(FillContactUsFormTest.class);

    @BeforeTest
    public void setDriver() {
        LOGGER.fatal("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^FATAL log message");
        LOGGER.error("++++++++++++++++++++++++++++++++++++++++++++++++ERROR log message");
        LOGGER.warn("*************************************************WARN log message");
        LOGGER.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%INFO log message");
        LOGGER.debug("================================================DEBUG log message");
        LOGGER.trace("------------------------------------------------TRACE log message");

        ixlooComFunctionality = new IxlooComFunctionality();
    }

    @Test
    public void openBrowser() {
        ixlooComFunctionality.openIxlooAdminPage();
        ixlooComFunctionality.fillContactUs(ixlooUser);
    }

    @Test
    public void allInfo() {
        ixlooComFunctionality.openIxlooAdminPage();
        ixlooComFunctionality.fillContactUsWithComments(ixlooUserWithComment);
    }

    @Test
    public void negative() {
        ixlooComFunctionality.openIxlooAdminPage();
        ixlooComFunctionality.fillContactUsNegativeTest(ixlooUserNegative);
        ixlooComFunctionality.checkZipError();
    }

}
