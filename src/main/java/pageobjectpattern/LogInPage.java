package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends Page  {

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	public void open() {
		String baseUrl = "https://szkolenia.bananascrum.com";
		driver.get(baseUrl + "/session/new");
		
	}

	public BackLogPage logIn(String login, String password) {
		driver.findElement(By.id("login")).sendKeys(login);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
		return new BackLogPage(driver);
	}

}
