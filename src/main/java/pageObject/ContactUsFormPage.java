package pageObject;

import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;
import utils.PropertyManager;

/**
 * Created by Diana on 03.04.2017.
 */
public class ContactUsFormPage extends AbstractPageObject {

    @FindBy(css = "input[name='first_name']")
    private WebElement firstName;

    @FindBy(css = "input[name='last_name']")
    private WebElement lastName;

    @FindBy(css = "input[name='phone']")
    private WebElement phone;

    @FindBy(css = "input[name='email']")
    private WebElement email;

    @FindBy(css = "input[name='international_phone']")
    private WebElement internationalPhone;

    @FindBy(css = "input[name='street']")
    private WebElement street;

    @FindBy(css = "input[name='city']")
    private WebElement city;

    @FindBy(css = "input[name='state']")
    private WebElement state;

    @FindBy(css = "input[name='zip']")
    private WebElement zip;

    @FindBy(css = "textarea[name='comments']")
    private WebElement comments;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    private WebElement btnSubmit;

    public ContactUsFormPage(WebDriver driver) {
        super(driver);
    }

    public void fillContactInformation(User user) {

        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        phone.sendKeys(user.getPhoneNumber());
        email.sendKeys(user.getEmail());
        internationalPhone.sendKeys(user.getInternationalPhone());
        street.sendKeys(user.getAddress());
        city.sendKeys(user.getCity());
        state.sendKeys(user.getState());
        zip.sendKeys(user.getZip());
    }

    public void fillContactInformationWithComment(User user) {

        fillContactInformation(user);
        comments.sendKeys(user.getComments());
    }

    public void fillContactInformationWithoutZip(User user) {

        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        phone.sendKeys(user.getPhoneNumber());
        email.sendKeys(user.getEmail());
        internationalPhone.sendKeys(user.getInternationalPhone());
        street.sendKeys(user.getAddress());
        city.sendKeys(user.getCity());
        state.sendKeys(user.getState());
        comments.sendKeys(user.getComments());
    }

    public void clickSubmitButton() {
        btnSubmit.click();
    }

    public String getZipColor() {
        return driver.findElement(By.xpath("//label[contains(text(), \"Zip/Postal Code:\")]/..")).getAttribute("class");
    }

    public void openIxlooAdminPage() {
        //driver.get("http://diana.ixloo.com/contactus");
        driver.get(PropertyManager.getUrlType().toString());
    }
}
