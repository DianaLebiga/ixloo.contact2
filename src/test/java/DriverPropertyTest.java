import data.User;
import data.UserRepository;
import functionality.IxlooComFunctionality;
import org.testng.annotations.Test;
import testng.AbstractTestCase;

/**
 * Created by Diana on 13.04.2017.
 */
public class DriverPropertyTest extends AbstractTestCase {

    private IxlooComFunctionality ixlooComFunctionality;
    private User user = UserRepository.getIxlooUser();

    @Test
    public void openChrome() {
        ixlooComFunctionality = new IxlooComFunctionality();
        ixlooComFunctionality.openIxlooAdminPage();
        ixlooComFunctionality.fillContactUs(user);
    }
}
