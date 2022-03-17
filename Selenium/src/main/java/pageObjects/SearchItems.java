package pageObjects;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchItems extends HomePage {

	List<String> results = new ArrayList<String>();

	String partialPath = "/html/body/div[5]/div[5]/div[2]/div[1]/div[2]/ul/li";

	public SearchItems(WebDriver driver) {
		super(driver);
	}

	public void listItems() throws IOException, InterruptedException {
		FileWriter file = new FileWriter("Items.txt");
		for (int i = 1; i < 61; i++) {
			results.add(partialPath + "[" + i + "]");
		}

		Thread.sleep(50000);
		for (String e : results) {
			file.write(super.driver.findElement(By.xpath(e)).findElement(By.className("s-item__title")).getText());
			file.write(System.getProperty( "line.separator" ));
			file.write(super.driver.findElement(By.xpath(e)).findElement(By.className("s-item__price")).getText());
			file.write(System.getProperty( "line.separator" ));
			file.write(System.getProperty( "line.separator" ));
		}
		file.close();
	}

//	public void Items() {
//		super.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		for(WebElement e : items) {
//			System.out.println(e.findElement(By.className("s-item__title")).getText());
//			System.out.println(e.findElement(By.className("s-item__price")).getText());
//		}
//	}
}
