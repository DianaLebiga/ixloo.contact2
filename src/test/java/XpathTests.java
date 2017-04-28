import functionality.ToolsQAFormFunctionality;
import org.testng.annotations.Test;
import testng.AbstractTestCase;

/**
 * Created by Diana on 23.04.2017.
 */
public class XpathTests extends AbstractTestCase {

    private ToolsQAFormFunctionality toolsQAFormFunctionality;

    @Test
    public void verifyAllElementByXpath() {
        toolsQAFormFunctionality = new ToolsQAFormFunctionality();
        toolsQAFormFunctionality.openToolsQAFormPage();
    }
}
