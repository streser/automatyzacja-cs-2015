package pageobjectpattern;

import org.junit.Test;

import junit.framework.Assert;

public class BananaScrumLogInTest {
	@Test 
	public void shouldLogIn(){
	 LogInPage lp = new LogInPage();
	 lp.open();
	 BackLogPage bp = lp.logIn("admin", "password");
	 Assert.assertTrue(bp.isOpen());
		
	}

}
