package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BacklogPage extends Page {
    private boolean open;

    public BacklogPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
        return isElementPresent(By.id("projeckt_id"));
    }
}
