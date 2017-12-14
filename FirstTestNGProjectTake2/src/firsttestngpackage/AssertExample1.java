package firsttestngpackage;

import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample1 {
		
	@Test
	public void testCaseVerifyHomePage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Google", driver.getTitle());
	}

}
