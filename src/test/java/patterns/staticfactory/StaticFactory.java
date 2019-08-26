package patterns.staticfactory;

import java.time.LocalDate;

public class StaticFactory {

    public static User createSimpleUser() {
        User user = new User();
        user.setFirstName("Helen");
        user.setLastName("Holubeva");
        user.setAge(20);
        return user;

    }

    public static User createUserFromBirthDate(int year) {
        User user =new User();
        user.setFirstName("Alina");
        user.setLastName("Malinina");
        user.setAge(LocalDate.now().getYear() - year);
        return user;
    }
}
