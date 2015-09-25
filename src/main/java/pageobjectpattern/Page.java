package pageobjectpattern;


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

    public  Page(WebDriver driver) {
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
    void waitFor(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
}
