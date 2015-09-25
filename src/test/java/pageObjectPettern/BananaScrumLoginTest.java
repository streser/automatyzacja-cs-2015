package pageObjectPettern;

import org.junit.Assert;
import org.junit.Test;
import pageObjectPattern.BacklogPage;
import pageObjectPattern.LoginPage;

public class BananaScrumLoginTest extends pageObjectPatternBase {

    @Test
    public void shouldTestLogIn() {
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        Assert.assertTrue(bp.isOpen());
    }
}
