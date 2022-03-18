package ebayTests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class HomePageTest {
	WebDriver driver = Base.initializer();
	HomePage hp = new HomePage(driver);

	@Test
	public void goToSignInPage() throws InterruptedException {
		hp.clickBellIcon().click();
		hp.clickSignInLink().click();
		Assert.assertEquals(driver.getTitle(), "Security Measure");

	}

	@Test
	public void goToHomePage() {
		Assert.assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
	}

	
}