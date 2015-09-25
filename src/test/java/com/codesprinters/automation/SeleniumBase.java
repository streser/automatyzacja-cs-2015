package com.codesprinters.automation;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBase {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;

	public SeleniumBase() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://szkolenia.bananascrum.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/session/new");
	
		logIn();
	}

	private void logOut() {
		click(By.linkText("Logout"));
	}

	protected void click(By locator) {
		driver.findElement(locator).click();
	}

	private void logIn() {
		driver.findElement(By.id("login")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.name("commit")).click();
	}

	protected void assertElementPresent(By locator) {
		assertTrue(isElementPresent(locator));
	}

	@After
	public void tearDown() throws Exception {
		logOut();
		driver.quit();
	
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