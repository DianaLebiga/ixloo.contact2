package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.AbstractPageObject;
import utils.url.UrlFactory;

/**
 * Created by Diana on 13.04.2017.
 */
public class AutomationPracticeSwitchWindows extends AbstractPageObject {

    @FindBy(id = "invisibility")
    private WebElement invisibility;

    @FindBy(id = "disabledElement")
    private WebElement disabledElement;

    @FindBy(id = "doubleClick")
    private WebElement doubleClick;

    @FindBy(id = "colorVar")
    private WebElement colorVar;

    @FindBy(id = "alert")
    private WebElement alert;

    @FindBy(id = "button1")
    private WebElement element1;

    public AutomationPracticeSwitchWindows(WebDriver driver) {
        super(driver);
    }

    public void openToolsQA() {
        driver.get(UrlFactory.getUrl().toString());
    }


    public void getElementColor() {
        WebElement element = driver.findElement(By.id("doubleClick"));
        String colorActual = element.getAttribute("style");
        System.out.println("Color of button is: " + colorActual);
    }

    public void doubleClickonBtn() {
        Actions action = new Actions(driver);
        doubleClick.sendKeys("");
        action.doubleClick(doubleClick).perform();
    }

    public void waitForColorChange() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.attributeContains(By.id("doubleClick"), "style", "color: orange;"));

        WebElement element1 = driver.findElement(By.id("doubleClick"));
        String colorActual1 = element1.getAttribute("style");

        Assert.assertEquals(colorActual1, "color: orange;");
        System.out.print("The color of the button has been chenged from white to: " + colorActual1);
    }
}
