package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	static WebDriver driver;
	
	public WebDriver initializer() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\catni\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		return driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
	}
	

	// Header items
	By eBayLogo = By.id("gh-la");
	By bellIcon = By.id("gh-Alerts-i");
	By cartIcon = By.id("gh-minicart-hover");
	By helpAndContactLink = By.id("gh-p-3");
	By dailyDealsLink = By.id("gh-p-1");
	By regLink = By.xpath("//*[@id=\"gh-ug-flex\"]/a");
	By pageSignInLink = By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/a");
	By bellSignInLink = By.id("gh-eb-Alerts-o");
	By shopByCategory = By.id("gh-shop-a");
	By searchTextBox = By.id("gh-ac");
	By searchBtn = By.id("gh-btn");
	By advancedSearchLink = By.id("gh-as-a");
	By sellLink = By.id("gh-p-2");
	By watchListLink = By.id("gh-wl-click");
	By myEbayLink = By.id("gh-eb-My");
	By searchCategoriesDropDown = By.id("gh-cat");
	By brandOutletLink = By.id("gh-p-4");

	// Header shop by category items
	By fashion = By.xpath("//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]");
	By shopCatElectronics = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[2]/h3[1]/a");
	By shopCatCollectibles = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/h3[1]/a");
	By shopCatHnG = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/h3[2]/a");
	By shopCatSportingGoods = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[3]/a");
	By shopCatToys = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/ul[3]/li[2]/a");
	
	//search bar category drop down item
	By searchCatSport = By.xpath("//*[@id=\"gh-cat\"]/option[29]");

	// Footer items (DIFFERENT ONLY ON HOMEPAGE)
	By footAboutEbay = By.xpath("//*[@id=\"gf-l\"]/li[1]/a");
	By footAnnouncements = By.xpath("/*[@id=\"gf-l\"]/li[2]/a");
	By footCommunity = By.xpath("//*[@id=\"gf-l\"]/li[3]/a");
	By footSecCenter = By.xpath("//*[@id=\"gf-l\"]/li[4]/a");
	By footSellerCenter = By.xpath("//*[@id=\"gf-l\"]/li[5]/a");
	By footPolicies = By.xpath("//*[@id=\"gf-l\"]/li[6]/a");
	By footAffiliates = By.xpath("//*[@id=\"gf-l\"]/li[7]/a");
	By footHelpContact=By.xpath("//*[@id=\"gf-l\"]/li[8]/a");
	By footSiteMap = By.xpath("//*[@id=\"gf-l\"]/li[9]/a");
	
	// Sign in and Register page items
	 By username = By.id("userid");
	 By continueBtn = By.id("signin-continue-btn");
	 By password = By.id("pass");
	 By signInBtn = By.id("sgnBt");
	 
	 By fName = By.id("firstname");
	 By lName = By.id("lastname");
	 By email = By.id("Email");
	 By regPass = By.id("password");
	 By regSubmitBtn = By.id("EMAIL_REG_FORM_SUBMIT");
	 String registrationPage = "https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Focsnext.ebay.com%2Focs%2Fca%3FpageId%3D6000%26srt%3D0100070000005059b1867791283d9eedfb857ea8f1269aa839a05633229eb7913a93ba547e3e2e894ecd200377b4ae8d73f60a27e2296ed1c6080c9471fffd25ca85c831b78c373d57cb3c704303962efde866a872978e%26reason%3D29%26category%3D500%26decisionId%3D3%26check%3Dtrue%26confirmDecisionId%3D3&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Focsnext.ebay.com%252Focs%252Fca%253FpageId%253D6000%2526srt%253D0100070000005059b1867791283d9eedfb857ea8f1269aa839a05633229eb7913a93ba547e3e2e894ecd200377b4ae8d73f60a27e2296ed1c6080c9471fffd25ca85c831b78c373d57cb3c704303962efde866a872978e%2526reason%253D29%2526category%253D500%2526decisionId%253D3%2526check%253Dtrue%2526confirmDecisionId%253D3";
	
	public void driverWait(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	}
	
	public WebElement clickSearchCatSport() {
		return driver.findElement(searchCatSport);
	}
	
	public WebElement clickSearchCatDropDown() {
		return driver.findElement(searchCategoriesDropDown);
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
		return driver.findElement(bellSignInLink);
	}
	
	public WebElement clickCat() {
		return driver.findElement(searchCategoriesDropDown);
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
	
	public WebElement clickAdvancedSearch() {
		return driver.findElement(advancedSearchLink);
	}
	
	public WebElement clickShopByCategory() {
		return driver.findElement(shopByCategory);
	}
	
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

	// Goes to captcha page
	public void signIn(String user, String pass) {
		driver.findElement(pageSignInLink).click();
		driver.findElement(username).sendKeys(user);
		driver.findElement(continueBtn).click();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signInBtn).click();
	}

	public void register(String fname, String lname, String Email, String pass) {
		driver.get(registrationPage);
		driver.findElement(fName).sendKeys(fname);
		driver.findElement(lName).sendKeys(lname);
		driver.findElement(email).sendKeys(Email);
		driver.findElement(regPass).sendKeys(pass);
		driver.findElement(regSubmitBtn).click();
	}


}
