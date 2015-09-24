import org.junit.Before;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumTest {
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

    @Test
    public void testJava1() throws Exception {
        driver.get(baseUrl + "/session/new");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();
        assertTrue(isElementPresent(By.id("project_id")));
        driver.findElement(By.linkText("Logout")).click();
    }

    @Test
    public void testJava2() throws Exception {
        driver.get(baseUrl + "/session/new");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.cssSelector("div.backlog")).click();
        //driver.findElement(By.linkText("Backlog"));
        assertTrue(isElementPresent(By.cssSelector("div.item-user-story")));
    }

    @Test
    public void testJava3() throws Exception {
        driver.get(baseUrl + "/session/new");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.cssSelector("div.timeline")).click();
        assertTrue(driver.getPageSource().contains("Project graphs and statistics"));
    }

    @Test
    public void testJava4() throws Exception {
        driver.get(baseUrl + "/session/new");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.cssSelector("div.sprint")).click();
        assertTrue(driver.getPageSource().contains("Title123"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}


