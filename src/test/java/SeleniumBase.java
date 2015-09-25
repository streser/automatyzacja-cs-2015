import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by md on 25.09.15.
 */
public class SeleniumBase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://szkolenia.bananascrum.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    protected void assertIsElementPresent(By locator) {
        assertTrue(isElementPresent(locator));
    }

    protected void open() {
        driver.get(baseUrl + "/session/new");
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

    protected void assertPageSourceContains(String text) {
        assertTrue(driver.getPageSource().contains(text));
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
