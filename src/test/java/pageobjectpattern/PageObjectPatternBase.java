package pageobjectpattern;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class PageObjectPatternBase {
    WebDriver driver;
    protected String baseUrl;
    private boolean acceptNextAlert = true;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        open();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    private void open() {
        baseUrl = "https://szkolenia.bananascrum.com";
    }

    protected void assertSourcePageContains(String text) {
        assertTrue(driver.getPageSource().contains(text));
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void logOut() {
        click(By.linkText("Logout"));
    }

    protected void logIn() {

    }
    protected void addItem() {}
}
