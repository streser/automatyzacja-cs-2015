package com.codesprinters.automation;



import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class firstSeleniumTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://szkolenia.bananascrum.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/session/new");
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys("admin");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("password");
    driver.findElement(By.name("commit")).click();
  }

  @Test
  public void test() throws Exception {
    
    assertTrue(isElementPresent(By.id("project_id")));
    
  }
  @Test
  public void ShouldOpenSprint() throws Exception {
	  driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div")).click();
	  assertTrue(isElementPresent(By.id("filter")));
	  driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[3]/a/div")).click();
	  driver.getPageSource().contains("2015-02-24");
	  
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
 