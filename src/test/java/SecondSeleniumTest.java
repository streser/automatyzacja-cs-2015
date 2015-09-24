


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondSeleniumTest {
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
        driver.get(baseUrl + "/session/new");
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();
        assertTrue(isElementPresent(By.id("project_id")));

        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div")).click();

        //ktora to zakladka?
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div")).click();
        assertTrue(driver.getPageSource().contains("Impediments"));

        //ktora to zakladka?
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[3]/a/div")).click();
        assertTrue(driver.getPageSource().contains("Sprints list"));

        //ktora to zakladka? backlog
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[2]/a/div")).click();
        assertTrue(driver.getPageSource().contains("Product backlog"));

        //ktora to zakladka?
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[1]/a/div")).click();
        assertTrue(driver.getPageSource().contains("Sprint load history"));

        driver.findElement(By.linkText("Logout")).click();
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
