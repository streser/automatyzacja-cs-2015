package pageobjectpattern;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2015-09-25.
 */
public class BacklogPage extends Page {


    public BacklogPage(WebDriver driver) {
        super(driver);
    }



    public boolean isOpen() {

        try {
            driver.findElement(By.id("project_id"));
                    return true;
        } catch (Exception e) {
        }
        return false;
    }

}
