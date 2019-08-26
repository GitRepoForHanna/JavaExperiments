package patterns.singletone;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GthubTest {

    @Test
    public void testGitHub() {
        WebDriver driver = WebdriverSingletone.getWebDriver();
        driver.get("https://github.com");
    }
    @Test
    public void testStackOverFlow() {
        WebDriver driver = WebdriverSingletone.getWebDriver();
        driver.get("http://stackoverflow.com");
    }

}
