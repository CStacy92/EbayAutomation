package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearch extends Base {
	
	WebDriver driver = super.initializer();

	// Left Rail "Items"
	By findItems = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[1]/a");
	By onEbayMotors = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[2]/a");
	By bySeller = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a");
	By byItemNumber = By.xpath("//*[@id=\"LeftPanel\"]/div[1]/div/ul/li[3]/a");

	By keywordTextBar = By.id("_nkw");
	By keywordOptionsMenu = By.id("_in_kw");
	By excludeWordsBar = By.id("_ex_kw");
	By categoriesMenu = By.id("e1-1");
	By findItemsSearchBtn = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[1]/div[3]/button");

	// Keyword Options Menu
	By allWordsAnyOrder = By.xpath("//*[@id=\"_in_kw\"]/option[1]");
	By anyWordsAnyOrder = By.xpath("//*[@id=\"_in_kw\"]/option[2]");
	By exactWordsAndOrder = By.xpath("//*[@id=\"_in_kw\"]/option[3]");
	By exactWordsAnyOrder = By.xpath("//*[@id=\"_in_kw\"]/option[4]");

	// Left Rail "Stores"
	By itemsInStores = By.xpath("//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[1]/a");
	By findStores = By.xpath("//*[@id=\"LeftPanel\"]/div[2]/div/ul/li[2]/a");
	By itemsInStoresBtn = By.xpath("//*[@id=\"adv_search_from\"]/ul[1]/li[1]/div[2]/ul/li[2]/span/button");

	// Search Including CheckBoxes
	By titleAndDescript = By.xpath("//*[@id=\"LH_TitleDesc\"]");
	By completedListings = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[2]/label[2]");
	By soldListings = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[2]/label[2]");
	
	//Include Price Range In Search
		//find items
	By InclPriceRange = By.xpath("//*[@id=\"_mPrRngCbx\"]");
	By fiMinRangeBox = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[2]");
	By fiMaxRangeBox = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[3]");
	By fiClearOptions = By.xpath("//*[@id=\"adv_search_from\"]/div[3]/a");
		//in stores
	By isMinRangeBox = By.xpath("//*[@id=\"adv_search_from\"]/ul[3]/li[2]/input[1]");
	By isMaxRangeBox = By.xpath("//*[@id=\"adv_search_from\"]/ul[3]/li[2]/input[2]");
	By isSearchBtn = By.xpath("//*[@id=\"adv_search_from\"]/ul[1]/li[1]/div[2]/ul/li[2]/span/button");
	
	public WebElement clickFiClearOptions() {
		return driver.findElement(fiClearOptions);
	}
	
	public WebElement clickIsSearchBtn() {
		return driver.findElement(isSearchBtn);
	}
	
	public WebElement enterISMinRange() {
		return driver.findElement(isMinRangeBox);
	}

	public WebElement enterISMaxRange() {
		return driver.findElement(isMaxRangeBox);
	}
	
	public WebElement clickItemsInStoresBtn() {
		return driver.findElement(itemsInStoresBtn);
	}
	
	public WebElement enterMaxRange() {
		return driver.findElement(fiMaxRangeBox);
	}
	
	public WebElement enterMinRange() {
		return driver.findElement(fiMinRangeBox);
	}
	
	public WebElement clickInclPriceRange() {
		return driver.findElement(InclPriceRange);
	}

	public WebElement clickExactWordsAnyOrder() {
		return driver.findElement(exactWordsAnyOrder);
	}

	public WebElement clickExactWordsAndOrder() {
		return driver.findElement(exactWordsAndOrder);
	}

	public WebElement clickAnyWordsAnyOrder() {
		return driver.findElement(anyWordsAnyOrder);
	}

	public WebElement clickAllWordsAnyOrder() {
		return driver.findElement(allWordsAnyOrder);
	}

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
