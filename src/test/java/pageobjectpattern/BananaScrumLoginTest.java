package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;

public class BananaScrumLoginTest extends PageObjectPatterBase {

    @Test
    public void shouldLogIn(){
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        Assert.assertTrue(bp.isOpen());

    }
}
