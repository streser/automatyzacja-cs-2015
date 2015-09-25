package pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private String baseUrl = "https://szkolenia.bananascrum.com";

    protected void open() {
        driver.get(baseUrl + "/session/new");
    }

    public BacklogPage logIn(String login, String password) {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(login);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        click(By.name("commit"));
        return new BacklogPage(driver);

    }


}
