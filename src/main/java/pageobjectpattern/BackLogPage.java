package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackLogPage extends Page {

	public BackLogPage(WebDriver driver) {
		super(driver);
		
	}

	public boolean isOpen() {
		try{
			driver.findElement(By.id("project_id"));
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

}
