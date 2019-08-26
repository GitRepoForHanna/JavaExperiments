package patterns.singletone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverSingletone {

    private static WebDriver instance;

    private WebdriverSingletone() {
    }

    public static WebDriver getWebDriver() {
        if (null == instance) {
            System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            instance = new ChromeDriver(options);
        }
        return instance;
    }
}
