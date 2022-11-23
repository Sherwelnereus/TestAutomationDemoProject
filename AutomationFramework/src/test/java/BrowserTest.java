import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
        @Test
        public void test(){

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.jenkins.io/");

            String title = driver.getTitle();
            Assert.assertEquals("Jenkins", title);

            System.out.println(title);

            driver.quit();

        }

    }
