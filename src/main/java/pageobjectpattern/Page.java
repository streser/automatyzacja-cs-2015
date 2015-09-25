package pageobjectpattern;

import org.openqa.selenium.WebDriver;

public abstract class Page {

	private WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
		
	}

}
