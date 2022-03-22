package pageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	By searchBar = By.id("search");
	By submitBtn = By.xpath("/html/body/div[2]/div[2]/nav/div[2]/form/button");
	By results = By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div//div"
			+ "/div/div/div[2]/div/div/div[1]/div[1]/a");
	By prices = By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div//div"
			+ "/div/div/div[2]/div/div/div[2]//div/div/div/span");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement searchText() {
		return driver.findElement(searchBar);
	}

	public WebElement submit() {
		return driver.findElement(submitBtn);
	}

	public List<WebElement> results() {
		return driver.findElements(results);
	}

	public List<WebElement> prices() {
		return driver.findElements(prices);
	}

}
