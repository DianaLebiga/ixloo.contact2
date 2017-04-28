package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.AbstractPageObject;
import utils.url.UrlFactory;

/**
 * Created by Diana on 23.04.2017.
 */
public class AutomationPracticeForm extends AbstractPageObject {

    @FindBy(xpath = "//h1[text()='Practice Automation Form']")
    private WebElement titleOfForm;

    @FindBy(xpath = "//legend/strong")
    private WebElement personalInformation;

    @FindBy(xpath = "//a[1]/strong")
    private WebElement partialLinkTest;

    @FindBy(xpath = "//a[@title='Automation Practice Table']")
    private WebElement linkTest;

    @FindBy(xpath = "//div[1]/strong[1]")
    private WebElement firstNameLable;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//div[1]/strong[2]")
    private WebElement lastNameLable;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;

    public AutomationPracticeForm(WebDriver driver) {
        super(driver);
    }

    public void openToolsQAForm() {
        driver.get(UrlFactory.getUrl().toString());
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    private String getElementName(WebElement element) {
        return element.getAttribute("name");
    }

    public void checkElementText(WebElement element, String text) {
        String actualTextOfElement = getElementText(element);
        Assert.assertTrue(actualTextOfElement.contains(text), "The item doesn't found correctly.");
    }

    public void checkElementName(WebElement element, String text) {
        String actualNameOfElement = getElementName(element);
        Assert.assertTrue(actualNameOfElement.contains(text), "The item doesn't found correctly.");
    }

    public void checkTextOfAllElements() {
        checkElementText(titleOfForm, "Practice Automation Form");
        checkElementText(personalInformation, "PERSONAL INFORMATION");
        checkElementText(partialLinkTest, "Partial Link Test");
        checkElementText(linkTest, "Link Test");
        checkElementText(firstNameLable, "First name:");
        checkElementText(lastNameLable, "Last name:");
    }

    public void checkNameOfAllElements() {
        checkElementName(firstNameField, "firstname");
        checkElementName(lastNameField, "lastname");
    }
}
