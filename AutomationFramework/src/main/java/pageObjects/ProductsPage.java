package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends Base{

//          - Price, Type Functionality
//          - Check Product Description, etc.
//          - Buy It Now functionality
	WebDriver driver = super.initializer();
	
	By firstElement = By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[3]/div[1]/span");
	By allListTab = By.xpath("//*[@id=\"s0-62-10-5-3[1]\"]/div[2]/div[1]/div/ul/li[1]/span");
	By acceptsOffersTab = By.xpath("//*[@id=\"s0-62-10-5-3[1]\"]/div[2]/div[1]/div/ul/li[2]/a");
	By auctionTab = By.xpath("//*[@id=\"s0-62-10-5-3[1]\"]/div[2]/div[1]/div/ul/li[3]/a");
	By buyItNowTab = By.xpath("//*[@id=\"s0-62-10-5-3[1]\"]/div[2]/div[1]/div/ul/li[4]/a");
	//navigate condition checkbox
	By conditionDropDown = By.xpath("//*[@id=\"nid-njn-6\"]/button");
	
	//Left Rail Search Refinements
	By priceOption1 = By.xpath("//*[@id=\"s0-62-10-0-1-2-6-0-6[3]\"]/li[1]/div/a/div/div/div/span[1]");
	By priceOption2 = By.xpath("//*[@id=\"s0-62-10-0-1-2-6-0-6[3]\"]/li[2]/div/a/div/div/div/span[1]");
	By priceOption3 = By.xpath("//*[@id=\"s0-62-10-0-1-2-6-0-6[3]\"]/li[3]/div/a/div/div/div/span[1]");
	By priceMinBox = By.xpath("//*[@id=\"s0-62-10-0-1-2-6-0-6[3]-0-textrange-beginParamValue-textbox\"]");
	By priceMaxBox = By.xpath("//*[@id=\"s0-62-10-0-1-2-6-0-6[3]-0-textrange-endParamValue-textbox\"]");
	By priceRangeBtn = By.xpath("//*[@id=\"s0-62-10-0-1-2-6-0-6[3]-0-textrange\"]/div/div[3]/button");
	
	By conditionOptions = By.id("x-refine__group__2");
	
	public WebElement getFirst() {
		return driver.findElement(firstElement);
	}
	
	public WebElement clickPriceRangeBtn() {
		return driver.findElement(priceRangeBtn);
	}
	
	public WebElement enterMinPrice() {
		return driver.findElement(priceMinBox);
	}
	public WebElement enterMaxPrice() {
		return driver.findElement(priceMaxBox);
	}
	
	public WebElement clickPrice1() {
		return driver.findElement(priceOption1);
	}
	
	public WebElement clickPrice2() {
		return driver.findElement(priceOption2);
	}
	
	public WebElement clickPrice3() {
		return driver.findElement(priceOption3);
	}
	
	public List<WebElement> numConditionOptions() {
		return driver.findElements(conditionOptions);
	}

	public List<WebElement> allListings(){
		List<WebElement> all = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul//li/div/div[2]/a/h3"));
		return all;
	}
	
	public List<WebElement> listingPrices(){
		List<WebElement> listPrices = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul//li/div/div[2]//div/div[1]/span"));
		return listPrices;
	}
	
	public WebElement clickAllListTab() {
		return driver.findElement(allListTab);
	}
	
	public WebElement clickAcceptsOffers() {
		return driver.findElement(acceptsOffersTab);
	}
	
	public WebElement clickAuction() {
		return driver.findElement(auctionTab);
	}
	
	public WebElement clickBuyItNow() {
		return driver.findElement(buyItNowTab);
	}
	
	public WebElement clickCondition() {
		return driver.findElement(conditionDropDown);
	}
}
