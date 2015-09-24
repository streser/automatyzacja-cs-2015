package com.codesprinters.automation;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium2Test {
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
	    //driver.findElement(By.linkText("Logout")).click();
	  }
	  
	  private boolean isElementPresent(By id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
	  public void Element() throws Exception {
		  driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div")).click();
		  
	  }
}
