package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JenkinsHomePage {

     WebDriver driver = null;
     By clickBlogLink = By.xpath("//a[@class='nav-link'][normalize-space()='Blog']");

    public JenkinsHomePage(WebDriver driver){

        this.driver = driver;

    }

    public void clickOnBlogLink(){

       driver.findElement(clickBlogLink).click();

    }
}
