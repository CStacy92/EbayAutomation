package targetTests;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class HomePageTest {

	HomePage hp = new HomePage(Base.initializer());
	
	@Test
	public void Search() {
		
		hp.searchText().sendKeys("Iphone");
		hp.submit().click();
	}
	
	@Test
	public void writeResults() throws IOException, InterruptedException {
		Thread.sleep(60000);
		FileWriter targetItems = new FileWriter("targetItems.txt");
		
		for (int i = 0; i < hp.results().size(); i++) {
			targetItems.write(hp.results().get(i).getText());
			targetItems.write(System.getProperty( "line.separator" ));
			targetItems.write(hp.prices().get(i).getText());
			targetItems.write(System.getProperty( "line.separator" ));
			targetItems.write(System.getProperty( "line.separator" ));
		}
		targetItems.close();
	}
}
