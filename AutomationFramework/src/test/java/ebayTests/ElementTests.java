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
		hp.clickMotors().click();
		hp.clickDailyDeals().click();
		dd.clickFashionTab().click();
		hp.closeDriver();
	}
	
	@Test
	public void fashionAndElectronics() {
		hp.driverWait(10);
		hp.clickElectronics().click();
		hp.clickDailyDeals().click();
		dd.clickFashionTab().click();
		hp.closeDriver();
	}
	
	@Test
	public void hgAndCollectibles() {
		hp.driverWait(10);
		hp.clickShopByCategory().click();
		hp.clickShopCatHnG().click();
		hp.clickShopByCategory().click();
		hp.clickShopCatCollectibles().click();
		hp.closeDriver();
	}
	
	@Test
	public void hgAndSportingGoods() {
		hp.driverWait(10);
		hp.clickShopByCategory().click();
		hp.clickShopCatHnG().click();
		hp.searchTextBox().sendKeys("Sporting Goods");
		hp.clickSearchCatDropDown().click();
		hp.clickSearchCatSport().click();
		hp.clickSearchBtn().click();
		hp.closeDriver();
	}

//		REMAINING CLICK TESTS
//		HnGAndSportingGoods
//		toysAndBusiness
//		businessAndMusic
//		musicAndDeals



	
}
