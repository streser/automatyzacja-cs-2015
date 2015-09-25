package pageobjectpattern;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2015-09-25.
 */
public class BacklogPage extends Page {
    public static final By CREATE_NEW_ITEM = By.name("commit");
    public static final By WAIT_FOR_USER_STORY = By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[1]/form/div[2]/div[2]/div[1]/label/input");
    private boolean open;

    public BacklogPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
        try {
            driver.findElement(By.id("project_id"));
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    protected void click(By locator) {
        driver.findElement(locator).click();
    }
    public void addItem(String title, String description) {

        click(By.linkText("Add item"));
        waitFor(WAIT_FOR_USER_STORY);
        driver.findElement(By.id("item_user_story")).sendKeys(title);
        driver.findElement(By.id("item_description")).sendKeys(description);
        click(CREATE_NEW_ITEM);

    }


    public boolean isItemPresent(String newItem) {
        waitFor(WAIT_FOR_USER_STORY);
        return driver.getPageSource().contains(newItem);
    }
}