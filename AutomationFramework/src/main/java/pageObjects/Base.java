package pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.PageObjects;

public class Base{
	

	WebDriver driver;
	PageObjects p = new PageObjects(driver);
	List<WebElement> featuredDeals;
	By spotlightDeal = By.xpath("//*[@id=\"refit-spf-container\"]/div[2]/div[2]/div[1]/div/div/div/a/h3/span/span");
	By featuredNames = By.xpath("//*[@id=\"refit-spf-container\"]/div[2]/div[2]/div[4]/div//div/div//div/a/h3/span/span");
	
	public WebDriver initializer(){
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\catni\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		return driver;
	}
	
	//Goes to captcha page
	public void signIn(String user, String pass) {
		driver.findElement(p.signInLink).click();
		driver.findElement(p.username).sendKeys(user);
		driver.findElement(p.continueBtn).click();
		driver.findElement(p.password).sendKeys(pass);
		driver.findElement(p.signInBtn).click();
	}
	
	public void register(String fname, String lname, String Email, String pass) {
		driver.get(p.registrationPage);
		driver.findElement(p.fName).sendKeys(fname);
		driver.findElement(p.lName).sendKeys(lname);
		driver.findElement(p.email).sendKeys(Email);
		driver.findElement(p.regPass).sendKeys(pass);
		driver.findElement(p.regSubmitBtn).click();	
	}
	
	public void showDailyDeals() {
		featuredDeals = driver.findElements(featuredNames);
		p.clickDailyDeals();
		System.out.println("Spotlight Deal: " + driver.findElement(spotlightDeal).getText());
		System.out.println();
		
		for (WebElement e : featuredDeals) {
			System.out.println(e.getText());
		}
		
	}

}
