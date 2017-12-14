package Examples;

import org.testng.annotations.Test;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		

@Listeners(Listener_Demo.class)

public class TestCases {
	
			
	// Test to pass as to verify listeners		
	@Test		
	public void Login() throws InterruptedException				
	{		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr98692");							
	    driver.findElement(By.name("password")).sendKeys("syrunan");	
	    Thread.sleep(3000);
	    driver.findElement(By.name("btnLogin")).click();					
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}		
}

