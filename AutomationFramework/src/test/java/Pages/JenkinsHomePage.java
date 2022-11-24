package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JenkinsHomePage {

    public static void clickOnBlogLink(WebDriver driver){
        WebElement blogLink = driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Blog']"));
        blogLink.click();
    }
}
