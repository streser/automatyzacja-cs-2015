package pageobjectpattern;

import org.junit.Test;

import junit.framework.Assert;

public class BananaScrumLogInTest extends PageObjectPatternBase{
	@Test 
	public void shouldLogIn(){
	 LogInPage lp = new LogInPage(driver);
	 lp.open();
	 BackLogPage bp = lp.logIn("admin", "password");
	 Assert.assertTrue(bp.isOpen());
		
	}

}
