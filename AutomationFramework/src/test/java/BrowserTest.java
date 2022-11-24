import Pages.JenkinsHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
        @Test
        public void test() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.jenkins.io/");
            driver.manage().window().maximize();

            JenkinsHomePage.clickOnBlogLink(driver);


            Thread.sleep(3000);

            driver.quit();

        }

    }
