package data;

/**
 * Created by Diana on 03.04.2017.
 */
public class UserRepository {
    public static User getIxlooUser() {
        return new User("Diana", "Lebiga", "+380988092977", "dianalebiga@gmail.com", "+38098292929",
                "test street", "Lviv11111", "Lviv", "10920");
    }

    public static User getIxlooUserWithComment() {
        return new User("Diana", "Lebiga", "+380988092977", "dianalebiga@gmail.com", "+38098292929",
                "test street", "Lviv", "Lviv", "10920", "comments test");
    }

    public static User getIxlooUserNegative() {
        return new User("Diana", "Lebiga", "+380988092977", "dianalebiga@gmail.com", "+38098292929",
                "test street", "Lviv", "Lviv", "", "comments test");
    }

    //TODO додати нового юзера з комментами - DONE
}
