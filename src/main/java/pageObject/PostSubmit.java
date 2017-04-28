package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;

/**
 * Created by Diana on 06.04.2017.
 */
public class PostSubmit extends AbstractPageObject {

    @FindBy(css = ".panel-title")
    private WebElement titleOfForm;

    @FindBy(css = ".panel-body > div")
    private WebElement content;

    @FindBy(css = ".panel-body > div > .text-center > div > span")
    private WebElement buttonOk;

    public PostSubmit(WebDriver driver) {
        super(driver);
    }

    public String getTitleOfFormText() {
        return titleOfForm.getText();
    }

    public String getContentText() {
        return content.getText();
    }

    public String getButtonOkTest() {
        return buttonOk.getText();
    }
}
