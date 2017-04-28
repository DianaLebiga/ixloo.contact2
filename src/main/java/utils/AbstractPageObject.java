package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Diana on 13.04.2017.
 */
public class AbstractPageObject {

    protected WebDriver driver;

    public AbstractPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
