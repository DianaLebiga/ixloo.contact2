import functionality.ToolsQAFunctionality;
import org.testng.annotations.Test;
import testng.AbstractTestCase;

/**
 * Created by Diana on 21.04.2017.
 */
public class ChangeColorTest extends AbstractTestCase {
    private ToolsQAFunctionality toolsQAFunctionality;

    @Test
    public void checkColorChangeOnDoubleClick() {
        toolsQAFunctionality = new ToolsQAFunctionality();
        toolsQAFunctionality.openToolsQAPage();
        toolsQAFunctionality.checkColorChangeOnDoubleClick();
    }
}
