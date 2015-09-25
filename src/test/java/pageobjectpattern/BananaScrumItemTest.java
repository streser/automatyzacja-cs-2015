package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class BananaScrumItemTest extends PageObjectPatterBase {

    @Test
    public void shouldaddItem(){
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        bp.addItem("nowy Item");
        Assert.assertTrue(bp.isaddItem("nowy Item"));


        }
}