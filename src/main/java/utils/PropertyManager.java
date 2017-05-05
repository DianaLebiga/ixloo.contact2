package utils;

import utils.driver.BrowserType;
import utils.url.TypeOfUrl;

import java.util.ResourceBundle;

/**
 * Читання проперті
 */
public class PropertyManager {

    private static String browserName;
    private static String baseUrl;
    private static int implicitWait;
    private static ResourceBundle bundle;

    public static void getProperties() {
        bundle = ResourceBundle.getBundle("contactus");

        browserName = bundle.getString("browser.type");
        baseUrl = bundle.getString("base.url");
        implicitWait = Integer.parseInt(bundle.getString("implicit.wait"));
    }

    public static BrowserType getBrowserType() {
        getProperties();

        BrowserType returnBrowserType = null;

        for (BrowserType browserType : BrowserType.values()) {
            if (browserName.equalsIgnoreCase(browserType.toString())) {
                returnBrowserType = browserType;
                break;
            }
        }
        return returnBrowserType;
    }

    public static TypeOfUrl getUrlType() {
        getProperties();

        TypeOfUrl typeOfUrl = null;

        for (TypeOfUrl urlType : TypeOfUrl.values()) {
            if (baseUrl.equalsIgnoreCase(urlType.toString())) {
                typeOfUrl = urlType;
                break;
            }
        }

        LoggerWrapper.getLogger().info("Enviroment" + " " + typeOfUrl.toString());
        return typeOfUrl;
    }

    public static int getImplicitWait() {
        getProperties();
        return implicitWait;
    }
}
