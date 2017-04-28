import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Selenium2Example {

    static WebDriver driver;

    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // And now use this to visit Google
        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.titleContains("Cheese"));

        (new WebDriverWait(driver, 10)).
                until(new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return d.getTitle().toLowerCase().startsWith("cheese!");
                    }
                });

        Assert.assertTrue(driver.getTitle().contains("Cheese!"));
        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        // Close the browser
        driver.quit();
    }
}

//TODO написати тест, який робить дабл клік по Change Color button, (написати ассерт) і
// перевірити що колір стайл став замість білого жовтим

//TODO Timing Alert button - тест який жме, потім чекає до появи алерту - кондишн - аллерт із презент

//TODO Alert Box button - ассерт на те що алерт візібл

// вейт, що чекає намбер оф виндовс ту би 2 = New Browser Window button

// короче, написати на всі елементи вейти + ассерти http://toolsqa.com/automation-practice-switch-windows/

