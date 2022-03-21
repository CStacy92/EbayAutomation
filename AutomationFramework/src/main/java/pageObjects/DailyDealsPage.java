package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DailyDealsPage extends Base {
	WebDriver driver = super.getDriver();
	List<WebElement> featuredDeals;

	By fashionTab = By.xpath("//*[@id=\"refit-spf-container\"]/div[1]/nav/ul/li[3]");
	By spotlightDeal = By.xpath("//*[@id=\"refit-spf-container\"]/div[2]/div[2]/div[1]/div/div/div/a/h3/span/span");
	By featuredNames = By
			.xpath("//*[@id=\"refit-spf-container\"]/div[2]/div[2]/div[4]/div//div/div//div/a/h3/span/span");
	
	public WebElement clickFashionTab() {
		return driver.findElement(fashionTab);
	}
	
	public WebElement clickSpotlight() {
		return driver.findElement(spotlightDeal);
	}
}
