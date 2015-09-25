package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class BackLogPage extends Page {

	public BackLogPage(WebDriver driver) {
		super(driver);
		
	}

	public boolean isOpen() {
		return isElementPresent(By.id("project_id"));
	}

	public void addItem(String title, String string2) {
		click(By.linkText("Add item"));
		waitFor(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[1]/form/div[2]/div[2]/div[1]/label/input"));
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[1]/form/div[2]/div[2]/div[1]/label/input")).sendKeys(title);
		click(By.name("commit"));
	}
	

	public boolean isListContains(String title) {
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[6]/div[3]/ul/li[1]/div[5]/div[2]"),
				title));
		return true;
	}

	private Predicate<WebDriver> textToBePresentInElementLocated(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
