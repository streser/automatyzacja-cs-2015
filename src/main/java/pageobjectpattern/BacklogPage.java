package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BacklogPage extends Page {
    public BacklogPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
        return isElementPresent(By.id("project_id"));
    }


    public void addItem(String unikatowaNazwa) {
        click(By.linkText("Add item"));
        waitFor(By.id("item_user_story"));
        driver.findElement(By.id("item_user_story")).clear();
        driver.findElement(By.id("item_user_story")).sendKeys(unikatowaNazwa);
        driver.findElement(By.id("item_description")).sendKeys("opis");
        click(By.name("commit"));

    }

    public boolean isItemAdded(String s) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
                ("/ html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[3]/ul/li[1]/div[5]/div[2]"), s));
        return true;
    }
}

