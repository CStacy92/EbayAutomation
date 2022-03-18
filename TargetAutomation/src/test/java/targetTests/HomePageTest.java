package targetTests;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class HomePageTest {

	HomePage hp = new HomePage(Base.initializer());
	
	@Test
	public void Search() {
		
		hp.searchText().sendKeys("Iphone");
		hp.submit().click();
		hp.searchResults();
	}
}
