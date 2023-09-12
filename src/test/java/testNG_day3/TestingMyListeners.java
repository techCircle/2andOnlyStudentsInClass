package testNG_day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(LIstenersTestNG.class)
public class TestingMyListeners {
	
	
	public WebDriver driver; 
	
	
	@Test
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();     ///success test
		driver = new ChromeDriver();
		driver.get("https://www.techcircle.dev");
	}
	
	@Test
	public void test2() {
				AssertJUnit.assertTrue(false);    //failed test
	}
	
	

}
