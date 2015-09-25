package pageobjectpattern;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BananaScrumItemTest extends PageObject {

    @Test
    public void shouldAddIthem() {

        // given
        LoginPage lp = new LoginPage(driver);
        lp.open();
        BacklogPage bp = lp.logIn("admin", "password");
        // when
        //kiedy dodam ithem
        bp.addIthem("User Story Gosia");



        //then
        //ithem bedzie dodany

        Assert.assertTrue(bp.isIthemAdded("User Story Gosia"));


    }
}
