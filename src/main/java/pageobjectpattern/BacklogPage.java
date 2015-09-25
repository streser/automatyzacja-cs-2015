package pageobjectpattern;

import org.openqa.selenium.WebDriver;

public class BacklogPage extends Page {
    public BacklogPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
        return false;
    }
}
