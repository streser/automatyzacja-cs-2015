import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Test2 {

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
    public void test1() throws Exception {
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
    public void test2() throws Exception {
        driver.get(baseUrl + "/session/new");

        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");

        driver.findElement(By.name("commit")).click();

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