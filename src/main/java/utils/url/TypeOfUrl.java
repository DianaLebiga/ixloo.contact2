package utils.url;

/**
 * Created by Diana on 20.04.2017.
 */
public enum TypeOfUrl {
    url1("http://diana.ixloo.com/contactus"),
    url2("http://diana.ixloo.com/notify"),
    url3("http://diana.ixloo.com/wizard"),
    url4("http://toolsqa.wpengine.com/automation-practice-switch-windows/"),
    url5("http://toolsqa.com/automation-practice-form/");

    private final String url;

    TypeOfUrl(String s) {
        url = s;
    }

    public String getUrl() {
        return url;
    }

    // @Override
    public String toString() {
        return url;
    }
}
