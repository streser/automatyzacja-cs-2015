package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;


public class BananaScrumItemTest extends PageObjectPatternBase {

    @Test
    public void shouldAddItem() {
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        bp.addItem("User Story");


        Assert.assertTrue(bp.isItemAdded("User Story"));


    }
}