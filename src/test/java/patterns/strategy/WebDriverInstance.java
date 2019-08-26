package patterns.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverInstance {
    private static WebDriver instance;
    public static final String PATH_TO_CHROMEDRIVER = "C:\\webdriver\\chromedriver.exe";

    private WebDriverInstance() {
    }

    public static WebDriver getWebDriverInstance() {
        if (null == instance){
            System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            instance = new ChromeDriver(options);
        }
        return instance;
    }
}
