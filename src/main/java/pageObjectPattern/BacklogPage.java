package pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BacklogPage extends Page {

    public BacklogPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
       
        return isElementPresent(By.id("project_id"));
    }
}
