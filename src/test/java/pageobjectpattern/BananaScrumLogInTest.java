package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;

public class BananaScrumLogInTest extends PageObjectPatterBase {

    @Test
    public void shouldLogIn() {
        // given
        LoginPage lp = new LoginPage(driver);
        lp.open();

        // when
        BacklogPage bp = lp.logIn("admin", "password");

        //then
        Assert.assertTrue(bp.isOpen());
    }
}
