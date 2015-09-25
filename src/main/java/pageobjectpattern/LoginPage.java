package pageobjectpattern;

import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2015-09-25.
 */
public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public void open() {
    }

    public BacklogPage logIn(String admin, String password) {
        return null;
    }
}
