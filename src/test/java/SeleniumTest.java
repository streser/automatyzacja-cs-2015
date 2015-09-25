

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static final By SPRINT_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div");
    public static final By SPRINT_LIST_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[3]/a/div");
    public static final By BACKLOG_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a/div");
    public static final By TIMELINE_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[1]/a");
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
    public void test() throws Exception {
        open();
        login();
        assertElementPresent(By.id("project_id"));

        click(SPRINT_MENU);
        assertPageSourceCointains("Impediments");
        click(SPRINT_LIST_MENU);
        assertPageSourceCointains("test");
        click(BACKLOG_MENU);
        assertPageSourceCointains("Product backlog");
        click(TIMELINE_MENU);
        assertPageSourceCointains("Product backlog");
        logout();
    }

    private void assertElementPresent(By locator) {
        assertTrue(isElementPresent(locator));
    }

    private void assertPageSourceCointains(String text) {
        assertTrue(driver.getPageSource().contains(text));
    }

    private void click(By locator) {
        driver.findElement(locator).click();
    }

    private void open() {
        driver.get(baseUrl + "/session/new");
    }

    private void logout() {
        click(By.linkText("Logout"));
    }

    private void login() {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        click(By.name("commit"));
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
