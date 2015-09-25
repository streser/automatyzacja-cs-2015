package pageObjectPettern;

import org.junit.Assert;
import org.junit.Test;
import pageObjectPattern.BacklogPage;
import pageObjectPattern.LoginPage;

public class BananaScrumAddItemsTest extends pageObjectPatternBase {

    @Test
    public void shouldAddItem () {
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");

        bp.addItem("story_edyta", "opis");
        //Assert.assertTrue(bp.isNewItem("story_edyta"));

    }

}
