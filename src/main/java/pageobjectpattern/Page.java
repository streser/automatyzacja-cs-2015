package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

	WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
		
	}
	public boolean isElementPresent(By by){
	try{
		driver.findElement(By.id("project_id"));
		return true;
	}catch (Exception e) {
		return false;
	}
	}
}
