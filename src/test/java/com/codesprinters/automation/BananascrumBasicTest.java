package com.codesprinters.automation;

import java.util.regex.Pattern;
import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class BananascrumBasicTest extends SeleniumBase {
	private static final String TIMELINE = "/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[1]/a/div";
	private static final String SPRINT_LIST_MENU = "/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[3]/a/div";
	private static final String SPRINT_MENU = "/html/body/div/div[2]/div[1]/div[2]/div[3]/ul/li[4]/a/div";
	@Test
	public void test() throws Exception {
		assertElementPresent(By.id("project_id"));
	}

	@Test
	public void ShouldOpenmenuTabs() throws Exception {
		click(By.xpath(SPRINT_MENU));
		assertElementPresent(By.id("filter"));

		click(By.xpath(SPRINT_LIST_MENU));
	}
}
