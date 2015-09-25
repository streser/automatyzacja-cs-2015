import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class SeleniumBase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://szkolenia.bananascrum.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    protected void assertElementPresent(By locator) {
        assertTrue(isElementPresent(locator));
    }

    protected void open() {
        driver.get(baseUrl + "/session/new");
    }

    protected void logOut() {
        click(By.linkText("Logout"));
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

    protected void assertPageSourceContains(String text) {
        assertTrue(driver.getPageSource().contains(text));
    }

    protected void loggInn() {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        click(By.name("commit"));
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }
}
