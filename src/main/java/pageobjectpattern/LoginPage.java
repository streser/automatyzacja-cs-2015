package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2015-09-25.
 */
public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public void open() {

        String baseUrl;
        baseUrl = "https://szkolenia.bananascrum.com";

        driver.get(baseUrl + "/session/new");
    }

    public BacklogPage logIn(String admin, String password) {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(admin);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        click(By.name("commit"));
        return new BacklogPage(driver);
    }
    protected void click(By locator) {
        driver.findElement(locator).click();
    }
}
