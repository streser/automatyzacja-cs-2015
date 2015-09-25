package pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BacklogPage extends Page {

    public BacklogPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
        return isElementPresent(By.id("project_id"));
    }

    public void addItem(String story, String opis) {
        driver.findElement(By.linkText("Add item")).click();
        waitFor(By.id("item_user_story"));
        driver.findElement(By.id("item_user_story")).sendKeys(story);
        driver.findElement(By.id("item_description")).sendKeys(opis);
        driver.findElement(By.name("commit")).click();

    }

    public boolean isNewItem(String title) {

        return waitFortext(title);

    }
}
