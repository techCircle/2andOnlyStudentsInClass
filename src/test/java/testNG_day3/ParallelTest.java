package testNG_day3;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	public WebDriver driver; 
	
	
	@Test
	public void ChromeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.techcircle.dev");
		System.out.println();
		
		
	}
	
	@Test
	public void safariTest() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get("https://www.techcircle.dev");
	}
	
	
	
	
	

}
