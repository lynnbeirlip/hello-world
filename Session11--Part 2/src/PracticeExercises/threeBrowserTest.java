package PracticeExercises;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class threeBrowserTest {
	public WebDriver driver;
	@Parameters({"browser"})
	
	
 //@DataProvider
  //public Object[][] dp() {
    //return new Object[][] {
      //new Object[] { 1, "a" },
      //new Object[] { 2, "b" },
    //};
  //}
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
			 
		
	// Once BeforeClass method is completed, Test method will start
		@Test(dataProvider = "dp")
			public void login() {
				driver.findElement(By.xpath("*.//[@id='account']/a")).click();
				driver.findElement(By.id("log")).sendKeys("testuser_1");
				driver.findElement(By.id("pwd")).sendKeys("Test@123");
				driver.findElement(By.id("signInSubmit")).click();		
			}
 

  @AfterClass
  public void afterTest() {
		driver.quit();
  }

}
