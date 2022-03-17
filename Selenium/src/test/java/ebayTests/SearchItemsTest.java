package ebayTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.SearchItems;


public class SearchItemsTest {
	WebDriver driver = Base.initializer();
	SearchItems srch = new SearchItems(driver);
	Base b = new Base();
	
	@Test
	public void searchItem() throws IOException, InterruptedException {
		srch.enterSearchText().sendKeys("Iphone");
		srch.clickSearchBtn().click();
		srch.listItems();
		driver.close();
	}

}
