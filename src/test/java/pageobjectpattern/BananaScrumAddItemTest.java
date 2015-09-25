package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;

public class BananaScrumAddItemTest extends PageObjectPatternBase{

    @Test
    public void shouldAddItem() {
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        bp.addItem("Kolejny element","czesc opisowa");
        Assert.assertTrue(bp.isItemPresent("Kolejny element"));

}
}
