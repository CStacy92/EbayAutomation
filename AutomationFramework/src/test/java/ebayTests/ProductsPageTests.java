package ebayTests;


import org.junit.Test;

import graphql.Assert;
import pageObjects.ProductsPage;

public class ProductsPageTests {
	ProductsPage p = new ProductsPage();

//	@Test
//	public void displayAllResults() {
//		p.initializer();
//		p.driverWait(10);
//		p.searchTextBox().sendKeys("iphone");
//		p.clickSearchBtn().click();
//		
//		for (int i = 0; i < p.allListings().size(); i ++) {
//			System.out.println(p.allListings().get(i).getText() + " " + p.listingPrices().get(i).getText());
//		}
//	}

	@Test
	public void searchAndRefinePrice() {
		//search and click second price checkbox
		p.driverWait(15);
		p.searchTextBox().sendKeys("Jaguar xj6");
		p.clickSearchBtn().click();
		p.clickPrice2().click();
		p.closeDriver();
	}
	
	@Test
	public void enterMinAndMax() {
		//search price range and verify first item 
		//is less than max price
		p.searchTextBox().sendKeys("Jaguar xj6");
		p.clickSearchBtn().click();
		p.driverWait(15);
		p.enterMinPrice().sendKeys("10000");
		p.enterMaxPrice().sendKeys("30000");
		p.clickPriceRangeBtn().click();
		int fPrice = Integer.valueOf(Integer.valueOf(p.getFirstPrice().getText().replace(".00", "").replace(",", "").replace("$","")));
		
		Assert.assertTrue( fPrice < 30000);
		p.closeDriver();

	}
	
	@Test
	public void verifyResults() {
		String item = "iphone";
		p.searchTextBox().sendKeys(item);
		p.clickSearchBtn().click();
		
		Assert.assertTrue(p.getFirstItem().getText().toLowerCase().contains(item));
		p.closeDriver();
	}
}
