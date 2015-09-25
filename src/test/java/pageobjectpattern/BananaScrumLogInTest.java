package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;

public class BananaScrumLogInTest {

    @Test
    public void shouldLogIn() {
        LoginPage lp = new LoginPage();
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        Assert.assertTrue(bp.isOpen());
    }
}
