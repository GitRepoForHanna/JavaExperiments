package patterns.decorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import patterns.factorymethod.ChromeDriverCreator;
import patterns.factorymethod.WebDriverCreator;
import patterns.singletone.WebdriverSingletone;

import java.util.concurrent.TimeUnit;

public class GitHubTest {
    @Test
    public void navigateToGitHub() {
        WebDriver driver = WebdriverSingletone.getWebDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver = new CustomWebDriver(driver);
        driver.navigate().to("https://github.com");
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }
}
