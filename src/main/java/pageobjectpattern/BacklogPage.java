package pageobjectpattern;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2015-09-25.
 */
public class BacklogPage extends Page {


    public BacklogPage(WebDriver driver) {
        super(driver);
    }


    public boolean isOpen() {

        try {
            driver.findElement(By.id("project_id"));
            return true;
        } catch (Exception e) {
        }
        return false;
    }


    public void addItem(String title, String description) {


        driver.findElement(By.linkText("Add item")).click();
        waitFor(By.xpath("//*[@id=\"item_user_story\"]"));
        driver.findElement(By.xpath("//*[@id=\"item_user_story\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"item_user_story\"]")).sendKeys(title);

        driver.findElement(By.id("item_description")).clear();
        driver.findElement(By.id("item_description")).sendKeys(description);
        driver.findElement(By.name("commit")).click();



    }

    public boolean isMyItemPresent(String title) {
        By locator = By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[3]/ul/li[1]/div[5]/div[2]");

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,title));

    return true;

    }

}