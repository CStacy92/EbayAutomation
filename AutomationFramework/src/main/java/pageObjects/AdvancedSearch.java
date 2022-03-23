package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearch extends Base{
	
	 WebDriver driver = super.initializer();
	
	 //Left Rail "Items"
	By findItems = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[1]/a");
	By onEbayMotors = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[2]/a");
	By bySeller = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a");
	By byItemNumber = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a");
	
	By keywordTextBar = By.id("_nkw");
	By keywordOptionsMenu = By.id("_in_kw");
	By excludeWordsBar = By.id("_ex_kw");
	By categoriesMenu = By.id("e1-1");
	By findItemsSearchBtn = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[1]/div[3]/button");
	
	
	//Left Rail "Stores"
	By itemsInStores = By.xpath("//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[1]/a");
	By findStores = By.xpath("//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[2]/a");
	
	//Search Including CheckBoxes
	By titleAndDescript = By.xpath("//*[@id=\"LH_TitleDesc\"]");
	By completedListings = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[2]/label[2]");
	By soldListings = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[2]/label[2]");
	
	public WebElement clickTitleAndDescript() {
		return driver.findElement(titleAndDescript);
	}
	
	public WebElement clickCompletedListings() {
		return driver.findElement(completedListings);
	}
	
	public WebElement clickSoldListings() {
		return driver.findElement(soldListings);
	}
	
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
	
	public WebElement clickKeywordTextBar() {
		return driver.findElement(keywordTextBar);
	}
	
	public WebElement clickKeywordOptionsMenu() {
		return driver.findElement(keywordOptionsMenu);
	}
	
	public WebElement clickFindItemsBtn() {
		return driver.findElement(findItemsSearchBtn);
	}
	
	public WebElement clickCategoriesMenu() {
		return driver.findElement(categoriesMenu);
	}
	
	public WebElement clickExcludeWords() {
		return driver.findElement(excludeWordsBar);
	}
	
	public WebElement clickItemsInStores() {
		return driver.findElement(itemsInStores);
	}
	
	public WebElement clickFindStores() {
		return driver.findElement(findStores);
	}
	
	

}
