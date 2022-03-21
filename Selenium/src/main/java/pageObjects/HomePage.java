package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	
	By eBayLogo = By.id("gh-logo");
	By bellIcon = By.id("gh-Alerts-i");
	By searchBtn = By.id("gh-btn");
	By searchTextBox = By.id("gh-ac");
	By signInLink = By.id("gh-eb-Alerts-o");
	By categoriesDropDown = By.id("gh-cat");
	By pageSignInLink = By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/a");
	By username = By.id("userid");
	By continueBtn = By.id("signin-continue-btn");
	By password = By.id("pass");
	By signInBtn = By.id("sgnBt");
	By fName = By.id("firstname");
	By lName = By.id("lastname");
	By email = By.id("Email");
	By regPass = By.id("password");
	By regSubmitBtn = By.id("EMAIL_REG_FORM_SUBMIT");
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
	String registrationPage = "https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1";
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickBellIcon() {
		return driver.findElement(bellIcon);
	}
	
	public WebElement clickEbayLogo() {
		return driver.findElement(eBayLogo);
	}
	
	public WebElement clickCartIcon() {
		return driver.findElement(cartIcon);
	}
	
	public WebElement clickSearchBtn() {
		return driver.findElement(searchBtn);
	}
	
	public WebElement clickCategories() {
		return driver.findElement(categoriesDropDown);
	}
	
	public WebElement bellSignInLink() {
		return driver.findElement(signInLink);
	}
	
	public WebElement clickPageSignIn(){
		return driver.findElement(pageSignInLink);
	}
	
	public WebElement enterSearchText() {
		return driver.findElement(searchTextBox);
	}
	
	public void dailyDeals() {
		driver.findElement(dailyDealsLink);
		
	}
	
	public void brandOutlet() {
		driver.findElement(brandOutletLink);
	}
	
	public void helpAndContact() {
		driver.findElement(helpAndContactLink);
	}
	
	public void sell() {
		driver.findElement(sellLink);
	}
	
	public void watchlist() {
		//is drop-down list
		driver.findElement(watchListLink);
	}
	
	public void myEbay() {
		//is drop-down list
		driver.findElement(myEbayLink);
	}
	
	public void notificationBell() {
		driver.findElement(bellIcon);
	}
	
	public void cart() {
		driver.findElement(cartIcon);
	}
	
	public void aboutEbay() {
		driver.findElement(aboutInfo);
	}
	
	public void announcements() {
		driver.findElement(announcementsLink);
	}
	
	public void community() {
		driver.findElement(communityLink);
	}
	
	public void securityCenter() {
		driver.findElement(secLink);
	}
	
	
}
