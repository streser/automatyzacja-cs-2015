package pageobjectpattern;

import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2015-09-25.
 */
public class BacklogPage extends Page {
    private boolean open;

    public BacklogPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
        return open;
    }
}
