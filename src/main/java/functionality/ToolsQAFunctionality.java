package functionality;

import pageObject.AutomationPracticeSwitchWindows;
import utils.driver.DriverFactory;

/**
 * Created by Diana on 21.04.2017.
 */
public class ToolsQAFunctionality {

    private AutomationPracticeSwitchWindows automationPracticeSwitchWindows;

    public void checkColorChangeOnDoubleClick() {
        automationPracticeSwitchWindows = new AutomationPracticeSwitchWindows(DriverFactory.getDriver());
        automationPracticeSwitchWindows.getElementColor();
        automationPracticeSwitchWindows.doubleClickonBtn();
        automationPracticeSwitchWindows.waitForColorChange();
    }

    public void openToolsQAPage() {
        automationPracticeSwitchWindows = new AutomationPracticeSwitchWindows(DriverFactory.getDriver());
        automationPracticeSwitchWindows.openToolsQA();
    }
}
