package functionality;

import pageObject.AutomationPracticeForm;
import utils.driver.DriverFactory;

/**
 * Created by Diana on 23.04.2017.
 */
public class ToolsQAFormFunctionality {

    private AutomationPracticeForm automationPracticeForm;

    public void openToolsQAFormPage() {
        automationPracticeForm = new AutomationPracticeForm(DriverFactory.getDriver());
        automationPracticeForm.openToolsQAForm();
        automationPracticeForm.checkTextOfAllElements();
        automationPracticeForm.checkNameOfAllElements();
    }
}
