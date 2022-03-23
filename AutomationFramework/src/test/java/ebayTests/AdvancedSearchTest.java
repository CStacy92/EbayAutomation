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
	}
	
	@Test
	public void keywordAndIncluding() {
		a.clickAdvancedSearch().click();
		a.clickKeywordTextBar().sendKeys("Vintage Dive Knife");
		a.clickTitleAndDescript().click();
		a.clickCompletedListings().click();
		a.clickSoldListings().click();
		a.clickFindItemsBtn().click();
		
	}
}
