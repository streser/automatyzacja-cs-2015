import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Administrator on 2015-09-24.
 */
public class BookmarksDisplay {

    public static final By MENU_SPRINT = By.xpath("//*[@id=\"top-menu\"]/li[4]/a/div");
    public static final By MENU_SPRINTS_LIST = By.xpath("//*[@id=\"top-menu\"]/li[3]/a/div");
    public static final By BACKLOG_MENU = By.xpath("//*[@id=\"top-menu\"]/li[2]/a/div");
    public static final By TIMELINE_MENU = By.xpath("//*[@id=\"top-menu\"]/li[1]/a/div");
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

    @Test
    public void shouldLoginLogout() throws Exception {
        open();
        login();
        assertTrue(isElementPresent(By.id("project_id")));
        logOut();


    }

    private void logOut() {
        click(By.linkText("Logout"));
    }

    private void login() {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        click(By.name("commit"));
    }

    @Test
    public void shouldOpenMenuTabs() throws Exception {


        open();
        login();

        click(MENU_SPRINT);
        assertPageSourceContains("szkolenia");

        click(MENU_SPRINTS_LIST);
        assertPageSourceContains("Sprints list");

        click(BACKLOG_MENU);
        assertPageSourceContains("Product backlog");

        click(TIMELINE_MENU);
        assertPageSourceContains("Project graphs and statistics");
        logOut();

//        driver.findElement(By.name("commit")).click();
//        driver.findElement(By.name("commit")).click();
//        driver.findElement(By.


    }

    private void click(By locator) {
        driver.findElement(locator).click();
    }

    private void assertPageSourceContains(String Text) {
        Assert.assertTrue(driver.getPageSource().contains(Text));
    }


    private void open() {
        driver.get(baseUrl + "/session/new"); //otwiera strone pod jakims URL
    }


//


    @After
    public void tearDown() throws Exception {
//        driver.quit();
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
