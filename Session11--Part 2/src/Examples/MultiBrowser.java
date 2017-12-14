package Examples;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.edge.*;
 
import org.testng.annotations.AfterClass;
 
import org.testng.annotations.BeforeClass;
 
import org.testng.annotations.Parameters;
 
import org.testng.annotations.Test;
 
public class MultiBrowser {
 
	public WebDriver driver;
 
	@Parameters({"browser"})
 
	@BeforeClass
 
	// Passing Browser parameter from TestNG xml
 
	public void beforeTest(String browser) {
 
	// If the browser is Firefox, then do this
 
		if(browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
					
 
	// If browser is Chrome, then do this
  
	}else if (browser.equalsIgnoreCase("chrome")) { 
		 
		// Setting up the path for my ChromeDriver	 
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	 
		driver = new ChromeDriver();
	  
		// If browser is IE, then do this	  
   
	}else if (browser.equalsIgnoreCase("edge")) { 
 
		// Here I am setting up the path for my Edge Driver
 
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\MicrosoftWebDriver.exe");
 
		driver = new EdgeDriver();
 
	} 
 
	// Doesn't the browser type, launch the Website
 
	driver.get("http://www.store.demoqa.com"); 
 
	}
 
	// Once Before method is completed, Test method will start
 
	@Test public void login() throws InterruptedException {
 
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
		driver.findElement(By.id("log")).sendKeys("testuser_1");
 
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
		driver.findElement(By.id("login")).click();
 
		}  
 
	@AfterClass public void afterTest() {
 
		driver.quit();
 
		}
 
}