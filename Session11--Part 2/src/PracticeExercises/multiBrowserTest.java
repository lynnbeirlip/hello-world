package PracticeExercises;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.edge.*;

public class multiBrowserTest {
	
	public WebDriver driver;
	
	@Parameters({"browser"})
	
	@BeforeClass
	 // Passing Browser parameter from TestNG xml	 
	 public void beforeTest(String browser) {
	 
	 // If the browser is Firefox, then do this	 
	 if(browser.equalsIgnoreCase("Firefox")) {
			  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\lynn.bierl\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	  
	  driver = new FirefoxDriver();
		 
	  System.out.print("This is the Firefox driver.");
			 
	 }else if (browser.equalsIgnoreCase("chrome")) { 
				 
	  // Setting up the path for my ChromeDriver	 
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	 
	  driver = new ChromeDriver();
	  System.out.println("This is the Chrome driver.");
		 		 
	 // If browser is Microsoft Edge, then do this	  	 
	 }else if (browser.equalsIgnoreCase("edge")) { 
	  // Setting up the path for my Microsoft WebDriver	 
	  System.setProperty("webdriver.edge.driver", "C:\\Selenium\\MicrosoftWebDriver.exe");
		 
	  driver = new EdgeDriver();
	  System.out.println("This is the Edge driver.");
	 } 
		 
	 
	 }
		 
	
	// Once BeforeClass method is completed, Test method will start
	@Test
	public void loginTest() throws InterruptedException {
		// Now launch the Website	 
		driver.get("http://www.amazon.com"); 
		Thread.sleep(5000);
		//driver.findElement(By.id("nav-link-accountList")).click();
		//Replacing .click command with Actions statements to try to get this to work in Edge
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		Actions actions = new Actions(driver);
		actions.click(accountList).perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		driver.findElement(By.id("ap_email")).sendKeys("testuser_3@aol.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("ap_password")).clear();
		driver.findElement(By.id("ap_password")).sendKeys("Test@123");
		driver.findElement(By.id("signInSubmit")).click();
		driver.switchTo().defaultContent();
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
