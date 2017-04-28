import data.User;
import data.UserRepository;
import functionality.IxlooComFunctionality;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Diana on 03.04.2017.
 */
public class FillContactUsFormTest {

    private User ixlooUser = UserRepository.getIxlooUser();
    private User ixlooUserWithComment = UserRepository.getIxlooUserWithComment();
    private User ixlooUserNegative = UserRepository.getIxlooUserNegative();

    private IxlooComFunctionality ixlooComFunctionality;

    @BeforeTest
    public void setDriver() {
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //TODO написати свій експлісіт вейт і флуент вейт
        ixlooComFunctionality = new IxlooComFunctionality();
    }

    @Test
    public void openBrowser() {
        ixlooComFunctionality.openIxlooAdminPage();
        ixlooComFunctionality.fillContactUs(ixlooUser);
    }

    @Test//(dependsOnMethods = "openBrowser")
    public void allInfo() {
        ixlooComFunctionality.openIxlooAdminPage();
        ixlooComFunctionality.fillContactUsWithComments(ixlooUserWithComment);
    }

    @Test(dependsOnMethods = "allInfo")
    public void negative() {
        ixlooComFunctionality.openIxlooAdminPage();
        ixlooComFunctionality.fillContactUsNegativeTest(ixlooUserNegative);
        ixlooComFunctionality.checkZipError();
    }

}
