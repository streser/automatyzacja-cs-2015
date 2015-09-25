package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.UUID;

/**
 * Created by Administrator on 2015-09-25.
 */
public class BananaScrumAddItemTest extends PageObjectPatternBase {

    String idOne = UUID.randomUUID().toString();



    @Test
    public void ShouldBePossibleToAddItem(){
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin","password");

        bp.addItem(idOne,"ToJestNoweUserStory");
        Assert.assertTrue(bp.isMyItemPresent("Title"));

    }




}
