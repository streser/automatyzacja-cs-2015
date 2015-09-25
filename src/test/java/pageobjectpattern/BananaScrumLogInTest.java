package pageobjectpattern;


import org.junit.Assert;
import org.junit.Test;

public class BananaScrumLogInTest extends PageObject {

    @Test
    public void shouldLogIn() {
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        Assert.assertTrue(bp.isOpen());
    }
}