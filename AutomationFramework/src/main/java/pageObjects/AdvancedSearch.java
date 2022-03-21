package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearch {
	
	Base b = new Base();
	WebDriver driver = b.initializer();
	
	//Left Rail "Items"
	By findItems = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[1]/a");
	By onEbayMotors = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[2]/a");
	By bySeller = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a");
	By byItemNumber = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a");
	
	By keywordTextBar = By.id("_nkw");
	By keywordOptionsMenu = By.id("_in_kw");
	By excludeWordsBar = By.id("_ex_kw");
	By categoriesMenu = By.id("e1-1");
	By findItemsSearchBtn = By.id("searchBtnUpperNoScript");
	
	
	//Left Rail "Stores"
	By itemsInStores = By.xpath("//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[1]/a");
	By findStores = By.xpath("//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[2]/a");
	
	public WebElement clickFindItems() {
		return driver.findElement(findItems);
	}
	
	public WebElement clickOnEbayMotors() {
		return driver.findElement(onEbayMotors);
	}
	
	public WebElement clickBySeller() {
		return driver.findElement(bySeller);
	}
	
	public WebElement clickByItemNumber() {
		return driver.findElement(byItemNumber);
	}
	
	public WebElement clickItemsInStores() {
		return driver.findElement(itemsInStores);
	}
	
	public WebElement clickFindStores() {
		return driver.findElement(findStores);
	}
	
	

}
