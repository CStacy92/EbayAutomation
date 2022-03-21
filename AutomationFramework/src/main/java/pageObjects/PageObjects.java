package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	
	WebDriver driver;
	public PageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	//Shop Category Drop-Down Menu
	By fashion = By.xpath("//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]");
	By shopCatElectronics = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[2]/h3[1]/a");
	By shopCatCollectibles = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/h3[1]/a");
	By shopCatHnG = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/h3[2]/a");
	By shopCatSportingGoods = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[3]/a");
	By shopCatToys = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/ul[3]/li[2]/a");
	
	public WebElement clickShopCatToys() {
		return driver.findElement(shopCatToys);
	}
	
	public WebElement clickShopCatSport() {
		return driver.findElement(shopCatSportingGoods);
	}
	
	public WebElement clickShopCatHnG() {
		return driver.findElement(shopCatHnG);
	}
	
	public WebElement clickShopCatCollectibles() {
		return driver.findElement(shopCatCollectibles);
	}
	
	public WebElement clickShopCatElec() {
		return driver.findElement(shopCatElectronics);
	}
	
	public WebElement fashionTab() {
		return driver.findElement(fashion);
	}

	//HOME PAGE
	By advancedSearchLink = By.id("gh-as-a");
	By eBayLogo = By.id("gh-la");
	By bellIcon = By.id("gh-Alerts-i");
	By searchBtn = By.id("gh-btn");
	By searchTextBox = By.id("gh-ac");
	By signInLink = By.id("gh-eb-Alerts-o");
	By categoriesDropDown = By.id("gh-cat");
	By pageSignInLink = By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/a");
	By dailyDealsLink = By.id("gh-p-1");
	By brandOutletLink = By.id("gh-p-4");
	By helpAndContactLink = By.id("gh-p-3");
	By sellLink = By.id("gh-p-2");
	By watchListLink = By.id("gh-wl-click");
	By myEbayLink = By.id("gh-eb-My");
	By cartIcon = By.id("gh-minicart-hover");
	By aboutInfo = By.xpath("//*[@id=\"gf-l\"]/li[1]/a");
	By announcementsLink = By.xpath("//*[@id=\"gf-l\"]/li[2]/a");
	By communityLink = By.xpath("//*[@id=\"gf-l\"]/li[3]/a");
	By secLink = By.xpath("//*[@id=\"gf-l\"]/li[4]/a");
	By savedLink = By.xpath("/html/body/div[6]/div[1]/ul/li[2]/a");
	By motorsLink = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]");
	By electronicsLink = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]");
	By collectiblesLink = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]");
	By homeAndGardenLink = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]");
	By clothingLink = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]");
	By toysLink = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]");
	By sportingGoods = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]");
	By businessAndIndustrial = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]");
	By moreDropdown = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[13]");
	By motorDeals = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[6]/a");
	By shopByCategory = By.id("gh-shop-a");
	By booksMoviesAndMusicCat = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/ul[3]/li[1]/a");
	
	public WebElement clickAdvancedSearch() {
		return driver.findElement(advancedSearchLink);
	}
	
	public WebElement clickBooksMoviesAndMusic() {
		return driver.findElement(booksMoviesAndMusicCat);
	}
	
	public WebElement clickShopByCategory() {
		return driver.findElement(shopByCategory);
	}
	
	public WebElement clickMotorDeals() {
		return driver.findElement(motorDeals);
	}
	public WebElement clickBusiness() {
		return driver.findElement(businessAndIndustrial);
	}
	
	public WebElement clickSportingGoods() {
		return driver.findElement(sportingGoods);
	}
	
	public WebElement clickToys() {
		return driver.findElement(toysLink);
	}
	
	public WebElement clickClothing() {
		return driver.findElement(clothingLink);
	}
	
	public WebElement clickHomeAndGarden() {
		return driver.findElement(homeAndGardenLink);
	}
	
	public WebElement clickCollectibles() {
		return driver.findElement(collectiblesLink);
	}
	
	public WebElement clickElectronics() {
		return driver.findElement(electronicsLink);
	}
	
	public WebElement clickMotors() {
		return driver.findElement(motorsLink);
	}
	
	public WebElement clickSaved() {
		return driver.findElement(savedLink);
	}
	
	public WebElement clickEbayLogo() {
		return driver.findElement(eBayLogo);
	}
	
	public WebElement clickBellIcon() {
		return driver.findElement(bellIcon);
	}
	
	public WebElement clickSearchBtn() {
		return driver.findElement(searchBtn);
	}
	
	public WebElement searchTextBox() {
		return driver.findElement(searchTextBox);
	}
	
	public WebElement clickPageSignInLink() {
		return driver.findElement(pageSignInLink);
	}
	
	public WebElement clickBellSignInLink() {
		return driver.findElement(signInLink);
	}
	
	public WebElement clickCat() {
		return driver.findElement(categoriesDropDown);
	}
	
	public WebElement clickDailyDeals() {
		return driver.findElement(dailyDealsLink);
	}
	
	public WebElement clickBrandOutlet() {
		return driver.findElement(brandOutletLink);
	}
	
	public WebElement clickHelpAndContact() {
		return driver.findElement(helpAndContactLink);
	}
	
	public WebElement clickSellLink() {
		return driver.findElement(sellLink);
	}
	
	public WebElement clickWatchlist() {
		return driver.findElement(watchListLink);
	}
	
	public WebElement clickMyEbay() {
		return driver.findElement(myEbayLink);
	}
	
	public WebElement clickCart() {
		return driver.findElement(cartIcon);
	}
	
	public WebElement clickAboutInfo() {
		return driver.findElement(aboutInfo);
	}
	
	public WebElement clickAnnouncements() {
		return driver.findElement(announcementsLink);
	}
	
	public WebElement clickCommunity() {
		return driver.findElement(communityLink);
	}
	
	public WebElement clickSecurity() {
		return driver.findElement(secLink);
	}
	
	//SIGN IN PAGE
	protected By username = By.id("userid");
	protected By continueBtn = By.id("signin-continue-btn");
	protected By password = By.id("pass");
	protected By signInBtn = By.id("sgnBt");
	
	public WebElement usernameBox() {
		return driver.findElement(username);
	}
	
	public WebElement clickContinue() {
		return driver.findElement(continueBtn);
	}
	
	public WebElement passwordBox() {
		return driver.findElement(password);
	}
	
	public WebElement signInBtn() {
		return driver.findElement(signInBtn);
	}
	
	//REGISTRATION PAGE
	protected By fName = By.id("firstname");
	protected By lName = By.id("lastname");
	protected By email = By.id("Email");
	protected By regPass = By.id("password");
	protected By regSubmitBtn = By.id("EMAIL_REG_FORM_SUBMIT");
	protected String registrationPage = "https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Focsnext.ebay.com%2Focs%2Fca%3FpageId%3D6000%26srt%3D0100070000005059b1867791283d9eedfb857ea8f1269aa839a05633229eb7913a93ba547e3e2e894ecd200377b4ae8d73f60a27e2296ed1c6080c9471fffd25ca85c831b78c373d57cb3c704303962efde866a872978e%26reason%3D29%26category%3D500%26decisionId%3D3%26check%3Dtrue%26confirmDecisionId%3D3&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Focsnext.ebay.com%252Focs%252Fca%253FpageId%253D6000%2526srt%253D0100070000005059b1867791283d9eedfb857ea8f1269aa839a05633229eb7913a93ba547e3e2e894ecd200377b4ae8d73f60a27e2296ed1c6080c9471fffd25ca85c831b78c373d57cb3c704303962efde866a872978e%2526reason%253D29%2526category%253D500%2526decisionId%253D3%2526check%253Dtrue%2526confirmDecisionId%253D3";
	
	public WebElement fNameBox() {
		return driver.findElement(fName);
	}
	
	public WebElement lNameBox() {
		return driver.findElement(lName);
	}
	
	public WebElement emailBox() {
		return driver.findElement(email);
	}
	
	public WebElement regPassBox() {
		return driver.findElement(regPass);
	}
	
	public WebElement regSubmitBtn() {
		return driver.findElement(regSubmitBtn);
	}
	
	public String regPage() {
		return registrationPage;
	}
	
	//Daily Deals
	By spotlightDealName = By.xpath("//*[@id=\"refit-spf-container\"]/div[2]/div[2]/div[1]/div/div/div/a/h3/span/span");
	
	public WebElement clickSpotlighDeal() {
		return driver.findElement(spotlightDealName);
	}
}
