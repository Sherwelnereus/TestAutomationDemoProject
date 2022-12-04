package sampleTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.JenkinsBlogPage;
import pages.JenkinsHomePage;

public class JenkinsBlogPageTest {

    @Test
    public void test() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jenkins.io/");
        driver.manage().window().maximize();

        JenkinsHomePage homePageObj = new JenkinsHomePage(driver);
        homePageObj.clickOnBlogLink();

        JenkinsBlogPage blogPageObj = new JenkinsBlogPage(driver);
        blogPageObj.clickOnLatestBlog();

        Thread.sleep(3000);

        driver.quit();

    }
}
