import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Administrator on 2015-09-24.
 */
public class BookmarksDisplay {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://szkolenia.bananascrum.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        /*
        za kazdym razem bedzie czekal do 30 sekund na zaladowanie strony
        globalne
        */
    }

    @Test
    public void ShouldLogin() throws Exception {
        driver.get(baseUrl + "/session/new"); //otwiera strone pod jakims URL
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();
        assertTrue(isElementPresent(By.id("project_id")));


    }

    @Test
     public  void ShouldDisplayBookmarks () throws Exception{


        driver.get(baseUrl + "/session/new"); //otwiera strone pod jakims URL
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.name("commit")).click();

        driver.findElement(By.xpath("//*[@id=\"top-menu\"]/li[4]/a/div")).click();
        Assert.assertTrue(driver.getPageSource().contains("szkolenia"));
        driver.findElement(By.xpath("//*[@id=\"top-menu\"]/li[3]/a/div")).click();
        Assert.assertTrue(driver.getPageSource().contains("Sprints list"));
        driver.findElement(By.xpath("//*[@id=\"top-menu\"]/li[2]/a/div")).click();
        Assert.assertTrue(driver.getPageSource().contains("Product backlog"));
        driver.findElement(By.xpath("//*[@id=\"top-menu\"]/li[1]/a/div")).click();
        Assert.assertTrue(driver.getPageSource().contains("Project graphs and statistics"));


//        driver.findElement(By.name("commit")).click();
//        driver.findElement(By.name("commit")).click();
//        driver.findElement(By.



        }


//        driver.findElement(By.linkText("Logout")).click();



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
