package pageobjectpattern;

import org.junit.Test;

import junit.framework.Assert;

public class bananascrumItemTest extends PageObjectPatternBase{
	@Test 
	public void shouldaddItem(){
	 LogInPage lp = new LogInPage(driver);
	 lp.open();
	 BackLogPage bp = lp.logIn("admin", "password");
	 
	 bp.addItem("tytul","opis");
	 
	
	 
	 Assert.assertTrue(bp.isListContains("tytul"));
		
	}

}
