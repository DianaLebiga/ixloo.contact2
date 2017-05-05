package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.driver.DriverFactory;

import java.io.File;
import java.io.IOException;

/**
 * Created by Diana on 05.05.2017.
 */
public class CustomTestListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        captureScreen();
    }

    public void onTestFailure(ITestResult iTestResult) {
        captureScreen();
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        iTestContext.getName();
        //TODO скріншоти з назвою класу і назвою методу - діставати з тест контексту
    }

    public void onFinish(ITestContext iTestContext) {

    }

    public String captureScreen() {
        String path;

        try {
            WebDriver augmentedDriver = new Augmenter().augment(DriverFactory.getDriver());
            File source = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
            path = "./target/screenshots/" + source.getName(); //класс нейм + сорс нейм
            FileUtils.copyFile(source, new File(path));
        } catch (IOException e) {
            path = "Failed to capture screenshot: " + e.getMessage();
        }

        return path;
    }
}
