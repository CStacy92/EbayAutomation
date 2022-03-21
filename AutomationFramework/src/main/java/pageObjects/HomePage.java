package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base {
	WebDriver driver = super.initializer();
	Actions action = new Actions(driver);
	PageObjects p = new PageObjects(driver);

	public void closeDriver() {
		driver.close();
	}
	
	public void driverWait(int numSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(numSeconds));
	}
	
	
//Nav Methods Originally Hovered to expand Menu but wasn't visible without adding a sleep command for user visibility... which kind of defeats
// the purpose of writing a code if I have to watch and see if the menu pops up...
	
	public void motorsAndFashion() {
		p.clickMotors().click();
		p.clickEbayLogo().click();
		p.clickDailyDeals().click();
		p.fashionTab().click();
	}

	public void fashionAndElectronics() {
		p.clickDailyDeals().click();
		p.fashionTab().click();
		p.clickShopByCategory().click();
		p.clickShopCatElec().click();
	}
	
	public void electronicsAndCollectibles() {
		p.clickEbayLogo().click();
		p.clickElectronics().click();
		p.clickShopByCategory().click();
		p.clickShopCatCollectibles().click();
	}
	
	public void HnGAndCollectibles() {
		p.clickEbayLogo().click();
		p.clickHomeAndGarden().click();
		p.clickEbayLogo().click();
		p.clickCollectibles().click();
	}
	
	public void HnGAndSportingGoods() {
		p.clickShopByCategory().click();
		p.clickShopCatSport().click();
		p.clickShopByCategory().click();
		p.clickShopCatHnG().click();
	}
	
	public void sportingGoodsAndToys() {
		p.clickShopByCategory().click();
		p.clickShopCatToys().click();
		p.clickShopByCategory().click();
		p.clickShopCatSport().click();
	}
	
	public void toysAndBusiness() {
		p.clickShopByCategory().click();
		p.clickShopCatToys().click();
		p.clickEbayLogo().click();
		p.clickBusiness().click();
	}
	
	public void businessAndMusic() {
		p.clickEbayLogo().click();
		p.clickBusiness().click();
		p.clickShopByCategory().click();
		p.clickBooksMoviesAndMusic().click();
	}
	
	public void musicAndDeals() {
		p.clickEbayLogo().click();
		p.clickShopByCategory().click();
		p.clickBooksMoviesAndMusic().click();
		p.clickEbayLogo().click();
		p.clickDailyDeals().click();
	}
	
	public void clickSpotlight() {
		p.clickDailyDeals();
		p.clickSpotlighDeal().click();
	}

}
