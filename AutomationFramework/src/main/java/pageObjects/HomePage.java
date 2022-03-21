package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Base {
	WebDriver driver = super.initializer();
	Actions action = new Actions(driver);

	//Home page Nav Bar items
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
	By booksMoviesAndMusicCat = By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[3]/ul[3]/li[1]/a");
	

	public WebElement clickBooksMoviesAndMusic() {
		return driver.findElement(booksMoviesAndMusicCat);
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
}