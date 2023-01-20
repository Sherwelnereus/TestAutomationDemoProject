package sampleTests;
import org.junit.Assert;
import pages.JenkinsHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JenkinsHomePageTest {
        @Test
        public void test() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.jenkins.io/");
            driver.manage().window().maximize();

            Thread.sleep(3000);

            driver.quit();

        }

    }
