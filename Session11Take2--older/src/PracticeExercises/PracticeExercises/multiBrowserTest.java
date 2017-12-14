package PracticeExercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class multiBrowserTest {
	
	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml	 
	  public void beforeTest(String browser) {
	 
	  // If the browser is Firefox, then do this	 
	  if(browser.equalsIgnoreCase("firefox")) {
		  
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\lynn.bierl\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		  	  
		  driver = new FirefoxDriver();
		 
	  }else if (browser.equalsIgnoreCase("chrome")) { 
			 
		  // Setting up the path for my ChromeDriver	 
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	 
		  driver = new ChromeDriver();
	 		 
	  // If browser is IE, then do this	  	 
	  }else if (browser.equalsIgnoreCase("ie")) { 
	 
		  // Setting up the path for my IEDriver	 
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\lynn.bierl\\Selenium\\IEDriverServer.exe");
	 
		  driver = new InternetExplorerDriver();
	  } 
	 
	  // Now launch the Website	 
	  driver.get("http://www.amazon.com"); 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test public void login() throws InterruptedException {
		  
		  	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("top loading washing machines");
		  
		  	driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		  	
		  	//Add command to pause for 10 seconds before closing the browser window
		  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			}  
		 
		  //@AfterClass public void afterTest() { 
				//driver.quit();		 
			//}
}
