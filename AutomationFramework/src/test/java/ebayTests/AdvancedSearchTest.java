package ebayTests;

import org.junit.Test;

import pageObjects.AdvancedSearch;

public class AdvancedSearchTest {

	AdvancedSearch a = new AdvancedSearch();
	
	@Test
	public void itemsAndKeyword() {
		a.clickAdvancedSearch().click();
		a.clickOnEbayMotors().click();
		a.clickFindItems().click();
		a.clickKeywordTextBar().sendKeys("Scuba");
		a.clickFindItemsBtn().click();
		a.closeDriver();
	}
	
	@Test
	public void keywordAndIncluding() {
		a.clickAdvancedSearch().click();
		a.clickKeywordTextBar().sendKeys("Vintage Dive Knife");
		a.clickTitleAndDescript().click();
		a.clickCompletedListings().click();
		a.clickSoldListings().click();
		a.clickFindItemsBtn().click();
		a.closeDriver();
	}
	
	@Test
	public void keywordWithOptions() {
		a.clickAdvancedSearch().click();
		a.clickKeywordTextBar().sendKeys("1976 Jaguar xj6");
		a.clickKeywordOptionsMenu().click();
		a.clickExactWordsAnyOrder().click();
		a.clickFindItemsBtn().click();
		a.closeDriver();
	}
	
	@Test
	public void itemsAndPriceRange() {
		a.driverWait(10);
		a.clickAdvancedSearch().click();
		a.clickItemsInStores().click();
		a.clickKeywordTextBar().sendKeys("BCD Zeagle");
		a.clickInclPriceRange().click();
		a.enterISMinRange().sendKeys("0");
		a.enterISMaxRange().sendKeys("1000");
		a.clickIsSearchBtn().click();
		a.closeDriver();
	}
	
	@Test
	public void filterAndClearOptions() {
		a.clickAdvancedSearch().click();
		a.clickKeywordTextBar().sendKeys("Ford Truck");
		a.clickKeywordOptionsMenu().click();
		a.clickExactWordsAnyOrder().click();
		a.clickExcludeWords().sendKeys("lifted");
		a.clickFiClearOptions().click();
		a.closeDriver();
	}
}
