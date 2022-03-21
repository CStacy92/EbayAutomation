package ebayTests;

import org.testng.annotations.Test;

import pageObjects.DailyDealsPage;
import pageObjects.HomePage;

public class ElementTests {
	HomePage hp = new HomePage();
	DailyDealsPage dd = new DailyDealsPage();

	@Test
	public void motorsAndFashion() {
		hp.driverWait(10);
		hp.clickEbayLogo().click();
		hp.clickMotors().click();
		hp.clickDailyDeals().click();
		dd.clickFashionTab().click();
	}
	
	@Test
	public void fashionAndElectronics() {
		hp.clickEbayLogo().click();
		hp.clickElectronics().click();
		hp.clickDailyDeals().click();
		dd.clickFashionTab().click();
	}
	
	@Test
	public void hgAndCollectibles() {
		hp.clickShopByCategory().click();
		hp.clickShopCatHnG().click();
		hp.clickShopByCategory().click();
		hp.clickShopCatCollectibles().click();
	}
	
	@Test
	public void hgAndSportingGoods() {
		hp.clickShopByCategory().click();
		hp.clickShopCatHnG().click();
		hp.searchTextBox().sendKeys("Sporting Goods");
		hp.clickSearchCatDropDown().click();
		hp.clickSearchCatSport().click();
		hp.clickSearchBtn().click();
	}

//		REMAINING CLICK TESTS
//		HnGAndSportingGoods
//		toysAndBusiness
//		businessAndMusic
//		musicAndDeals


//	@Test
//	public void registerTest() {
//		// placeholder values for registration info
//		//int required for password to pass
//		hp.driverWait(15);
//		int passNum = 52;
//		hp.register("First", "Last", "Email", "Password" + passNum);
//		hp.clickEbayLogo().click();
//	}
//
//	
//	@Test
//	public void signInTest() {
//		// placeholder values
//		hp.signIn("User", "Password");
//		hp.clickEbayLogo().click();
//	}
	
	
}
