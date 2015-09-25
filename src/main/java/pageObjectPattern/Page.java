package pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public boolean waitFor(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return true;
    }

    public boolean waitFortext(String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[3]/ul/li[1]/div[5]/div[2]"), text));
        return true;
    }
}
