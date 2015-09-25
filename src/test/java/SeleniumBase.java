import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2015-09-25.
 */
public class SeleniumBase {
    protected WebDriver driver;
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
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        click(By.name("commit"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
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
