import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2015-09-25.
 */
public class SeleniumBase {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
//        driver = new HtmlUnitDriver();

        baseUrl = "https://szkolenia.bananascrum.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        /*
        za kazdym razem bedzie czekal do 30 sekund na zaladowanie strony
        globalne
        */
    }

    protected void logOut() {
        click(By.linkText("Logout"));
    }

    protected void login() {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        click(By.name("commit"));
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void assertPageSourceContains(String Text) {
        Assert.assertTrue(driver.getPageSource().contains(Text));
    }

    protected void open() {
        driver.get(baseUrl + "/session/new"); //otwiera strone pod jakims URL
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
