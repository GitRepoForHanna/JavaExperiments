package patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class ChromeDriverCreator extends WebDriverCreator {

    public static final String PATH_TO_CHROMEDRIVER = "C:\\webdriver\\chromedriver.exe";

    @Override
    public WebDriver createWEBDriver() {
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(
                new File(PATH_TO_CHROMEDRIVER)
        ).build();

        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        webDriver = new ChromeDriver(service);
        return webDriver;
    }
}
