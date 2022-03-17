package ebayTests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	//FileWriter file;
	public static WebDriver initializer(){
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\catni\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		
		return driver;
	}
	
//	public FileWriter fileWriter() {
//		try {
//			file = new FileWriter("Items.txt");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return file;
//	}
//	public void write(String i) {
//		try {
//			file.write(i);
//			file.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
