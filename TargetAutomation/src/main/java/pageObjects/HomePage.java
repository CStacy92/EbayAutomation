package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	By searchBar = By.id("search");
	By submitBtn = By.xpath("/html/body/div[2]/div[2]/nav/div[2]/form/button");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement searchText() {
		return driver.findElement(searchBar);
	}

	public WebElement submit() {
		return driver.findElement(submitBtn);
	}

	public void searchResults() {
		try {
			Thread.sleep(60000);
			List<WebElement> results = driver.findElements(
					By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div//div"
							+ "/div/div/div[2]/div/div/div[1]/div[1]/a"));
			List<WebElement> prices = driver.findElements(
					By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div[1]/div[2]/div/section/div//div"
							+ "/div/div/div[2]/div/div/div[2]//div/div/div/span"));

			for (int i = 0; i < results.size(); i++) {
				System.out.println(results.get(i).getText());
				System.out.println(prices.get(i).getText());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
