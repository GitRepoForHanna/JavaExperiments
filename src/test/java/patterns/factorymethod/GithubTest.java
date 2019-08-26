package patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GithubTest {

    @Test
    public void testGitHub() {
        WebDriverCreator creator = new FireFoxDriverCreator();
        WebDriver driver = creator.createWEBDriver();
        driver.navigate().to("https://github.com");
    }

}
