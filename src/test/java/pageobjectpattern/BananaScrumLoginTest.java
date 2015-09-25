package pageobjectpattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2015-09-25.
 */
public class BananaScrumLoginTest extends PageObjectPatternBase {

    @Test
    public void shouldLogin(){
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin","password");
        Assert.assertTrue(bp.isOpen());

    }




}
