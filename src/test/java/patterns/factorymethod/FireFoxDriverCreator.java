package patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxDriverCreator extends WebDriverCreator {
    public static final String PATH_TO_FIREFOXDRIVER = "C:\\webdriver\\geckodriver.exe";
    @Override
    public WebDriver createWEBDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", true);
        System.setProperty("webdriver.gecko.driver", PATH_TO_FIREFOXDRIVER);
        webDriver = new FirefoxDriver(options);
        return webDriver;
    }
}
