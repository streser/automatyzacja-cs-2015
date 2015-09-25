package pageObjectPettern;

import org.junit.Assert;
import org.junit.Test;

public class BananaScrumLoginTest {
    @Test
    public void shouldTestLogIn() {
        LoginPage lp = new LoginPage();
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        Assert.assertTrue(bp.isOpen());
    }
}
