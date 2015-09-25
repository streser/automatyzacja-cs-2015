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


        String baseUrl = "https://szkolenia.bananascrum.com";
        driver.get(baseUrl + "/session/new"); //otwiera strone pod jakims URL

    }

    public BacklogPage logIn(String login, String password) {

        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(login);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("commit")).click();

        return new BacklogPage(driver);

    }



}
