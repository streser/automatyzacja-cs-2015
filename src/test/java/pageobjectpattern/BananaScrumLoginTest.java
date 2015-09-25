package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2015-09-25.
 */
public class BananaScrumLoginTest {

    @Test
    public void shouldLogin(){
        LoginPage lp = new LoginPage();
        lp.open();
        BacklogPage bp = lp.logIn("admin","password");
        Assert.assertTrue(bp.isOpen());

    }




}
