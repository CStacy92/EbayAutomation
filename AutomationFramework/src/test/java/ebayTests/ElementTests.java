package ebayTests;



import org.junit.Test;

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



	
}
