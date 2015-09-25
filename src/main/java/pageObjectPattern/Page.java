package pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public abstract class Page {
    WebDriver driver;

    protected void click(By locator) {

        driver.findElement(locator).click();
    }
    public Page(WebDriver driver) {
        this.driver = driver;
    }
    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
