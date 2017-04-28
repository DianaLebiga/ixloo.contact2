import com.google.common.base.Function;
import com.google.common.base.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTool {

    private WebDriver driver;


    @Test
    public void waitForElementPresent() {


        driver = new FirefoxDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(15, TimeUnit.SECONDS);

        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver arg0) {
                WebElement element = arg0.findElement(By.id("colorVar"));
                String color = element.getAttribute("style");
                System.out.println("The color if the button is " + color);
                if (color.contains("red")) {
                    return true;
                }
                return false;
            }
        };

        wait.until(function);
    }

    @Test
    public void predicateTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(2, TimeUnit.MINUTES);
        // wait.ignoring(NoSuchElementException.class); //make sure that this exception is ignored

        Predicate<WebDriver> predicate = new Predicate<WebDriver>() {

            public boolean apply(WebDriver arg0) {
                WebElement element = arg0.findElement(By.id("colorVar"));
                String color = element.getAttribute("style");
                System.out.println("The color if the button is " + color);
                if (color.contains("red")) {
                    return true;
                }
                return false;
            }
        };
        wait.until(predicate);
    }

    @Test
    public void returnWebelementFluentWail() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(2, TimeUnit.MINUTES);
        wait.ignoring(NoSuchElementException.class); //make sure that this exception is ignored
        Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver arg0) {
                System.out.println("Checking for the element!!");
                WebElement element = arg0.findElement(By.id("target"));
                if (element != null) {
                    System.out.println("Target element found");
                }
                return element;
            }
        };

        wait.until(function);
    }

//TODO написати тест, який робить дабл клік по Change Color button, (написати ассерт) і
// перевірити що колір стайл став замість білого жовтим

    @Test
    public void doubleClickAndFluentWail() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.id("doubleClick"));
        action.doubleClick(element).perform();


        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement doubleClickButton = driver.findElement(By.id("doubleClick"));
        wait.until(ExpectedConditions.attributeToBe(doubleClickButton, "style", "orange"));

    }
}
