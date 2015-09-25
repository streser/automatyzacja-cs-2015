package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackLogPage extends Page {

	public BackLogPage(WebDriver driver) {
		super(driver);
		
	}

	public boolean isOpen() {
		return isElementPresent(By.id("project_id"));
	}

}
