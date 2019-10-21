package patterns.singletone;

import org.openqa.selenium.WebDriver;

import java.lang.reflect.Constructor;

public class TestEnumSingletone {
    public static void main(String[] args) {
        EnumSingletone singletone = EnumSingletone.INSTANCE;
        System.out.println("1 - " + singletone.getValue());
        singletone.setValue(3);
        System.out.println("2 - " + singletone.getValue());

        EnumSingletone singletone2 = EnumSingletone.INSTANCE;
        System.out.println("11 - " + singletone2.getValue());
        singletone2.setValue(4);
        System.out.println("22 - " + singletone2.getValue());

        WebDriver webDriverSingletone = WebdriverSingletone.getWebDriver();
        try {
            Constructor constructor = webDriverSingletone.getClass().getDeclaredConstructor(new Class[0]);
            constructor.setAccessible(true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
