package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	protected void click(By locator) {
		driver.findElement(locator).click();
	}
	
	void waitFor(By locator){
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
}
