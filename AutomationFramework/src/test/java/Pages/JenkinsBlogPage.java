package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JenkinsBlogPage {

    WebDriver driver = null;

    By clickLatestBlog = By.xpath("//h5[normalize-space()='Jenkins Sponsor Appreciation']");

    public JenkinsBlogPage(WebDriver driver){

        this.driver = driver;

    }

    public void clickOnLatestBlog(){
        driver.findElement(clickLatestBlog).click();
    }

}
