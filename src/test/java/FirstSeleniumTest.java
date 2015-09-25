import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
    public static final By SPRING_MENU = By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a");
    public static final String SPRING_LIST_MENU = "/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a";
    public static final String BACKLOG_MENU = "/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[3]/a";
    public static final String TIMLINE_MENU = "/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a";
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
    public void shouldLogInn() throws Exception {
        open();
        loggInn();
        assertElementPresent(By.id("project_id"));
        logOut();


    }

    private void assertElementPresent(By locator) {
        assertTrue(isElementPresent(locator));
    }

    private void open() {
        driver.get(baseUrl + "/session/new");
    }

    private void logOut() {
        click(By.linkText("Logout"));
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

    @Test
    public void shouldGoToFirst() throws Exception {
        open();
        loggInn();
        click(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a"));
        assertPageSourceContains("Impediments");
    }

    private void assertPageSourceContains(String text) {
        assertTrue(driver.getPageSource().contains(text));
    }

    private void loggInn() {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        click(By.name("commit"));
    }


    @Test
    public void test4() throws Exception {
        open();
        loggInn();
        click(By.xpath(SPRING_LIST_MENU));
        assertPageSourceContains("Impediments");
        click(By.xpath(BACKLOG_MENU));
        assertPageSourceContains(" Sprints list ");
        click(By.xpath(TIMLINE_MENU));
        assertPageSourceContains("User Story");
    }

    private void click(By locator) {
        driver.findElement(locator).click();
    }
}




