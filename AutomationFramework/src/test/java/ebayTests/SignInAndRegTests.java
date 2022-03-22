package ebayTests;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class SignInAndRegTests {
	
	HomePage hp = new HomePage();
	
	@Test
	public void registerTest() {
		// placeholder values for registration info
		//int required for password to pass
		hp.driverWait(15);
		int passNum = 52;
		hp.register("First", "Last", "Email", "Password" + passNum);
		hp.clickEbayLogo().click();
	}

	
	@Test
	public void signInTest() {
		// placeholder values
		hp.signIn("User", "Password");
		hp.clickEbayLogo().click();
	}	

}
