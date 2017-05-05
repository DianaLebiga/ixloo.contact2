package functionality;

import data.User;
import org.testng.Assert;
import pageObject.ContactUsFormPage;
import pageObject.PostSubmit;
import utils.driver.DriverFactory;


/**
 * Created by Diana on 03.04.2017.
 */
public class IxlooComFunctionality {

    private ContactUsFormPage contactUsFormPage;
    private PostSubmit postSubmitPage;

    public void openIxlooAdminPage() {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        contactUsFormPage.openIxlooAdminPage();
    }

    //методи з пейдж обджекту, не в тестах
    public void fillContactUs(User user) {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        contactUsFormPage.fillContactInformation(user);
        contactUsFormPage.clickSubmitButton();
    }

    public void fillContactUsWithComments(User user) {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        contactUsFormPage.fillContactInformationWithComment(user);
        contactUsFormPage.clickSubmitButton();

        postSubmitPage = new PostSubmit(DriverFactory.getDriver());

        String title = postSubmitPage.getTitleOfFormText();
        String content = postSubmitPage.getContentText();
        String buttonText = postSubmitPage.getButtonOkTest();
        Assert.assertTrue(title.contains("Contact Us"));
        Assert.assertTrue(content.contains("Your request has been received.\n" +
                "A customer service representative will contact you shortly to complete the transaction.\n" +
                "\n" +
                "Thank you for using Best Dealer service."));
        Assert.assertTrue(buttonText.contains("OK"));
    }

    public void fillContactUsNegativeTest(User user) {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        contactUsFormPage.fillContactInformationWithoutZip(user);
        contactUsFormPage.clickSubmitButton();
    }

    public void checkZipError() {
        contactUsFormPage = new ContactUsFormPage(DriverFactory.getDriver());
        String zipErrorClass = contactUsFormPage.getZipColor();
        Assert.assertTrue(zipErrorClass.contains("has-error"), "Zip color is not red!");
    }

    //http://diana.ixloo.com/notify
    //http://diana.ixloo.com/wizard
    //http://diana.ixloo.com/account login: for_test, pass:1111

}
