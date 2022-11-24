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

            String title = driver.getTitle();
            Assert.assertEquals("Jenkins", title);

            System.out.println(title);
            WebElement blogLink = driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Blog']"));
            blogLink.click();

            Thread.sleep(3000);

            driver.quit();

        }

    }
