package utils.url;

import utils.PropertyManager;

/**
 * Created by Diana on 21.04.2017.
 */
public class UrlFactory {

    public static TypeOfUrl typeOfUrl;

    private UrlFactory() {
    }

    public static TypeOfUrl getUrl() {
        if (typeOfUrl == null) {
            switch (PropertyManager.getUrlType()) {
                case url1:
                    typeOfUrl = TypeOfUrl.url1;
                    break;
                case url2:
                    typeOfUrl = TypeOfUrl.url2;
                    break;
                case url3:
                    typeOfUrl = TypeOfUrl.url3;
                case url4:
                    typeOfUrl = TypeOfUrl.url4;
                    break;
                case url5:
                    typeOfUrl = TypeOfUrl.url5;
                    break;
            }
        }
        return typeOfUrl;
    }
}
