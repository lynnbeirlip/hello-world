package windowHandles;

import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getWindowHandles {
	WebDriver driver; 	
	String baseUrl;  
		
	@Before
	public void setUp() throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = ("http://phptravels.com/demo/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void getHandles() throws Exception {
		driver.get(baseUrl);
	
		//Get the Parent Handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent handle is: " + parentHandle);
				
		//Find Homepage Front End button
		WebElement frontendButton = driver.findElement(By.xpath("html/body/section[2]/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a"));
		String elementText = frontendButton.getText();

		System.out.println("Text on the Homepage Front-End button is: " + elementText);
		
		Thread.sleep(5000);
		frontendButton.click();
		Thread.sleep(5000);
		System.out.println("The script has clicked on the Front End button.");
		
		//Get all Handles
	    Set handles = driver.getWindowHandles();
	    	    
        System.out.println("Here are all the handles:" + handles);
		
		//Switch between Handles
			for (String handle : driver.getWindowHandles()) {
				
				//System.out.println(handle); 
				
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				System.out.print("We have switched to this handle: " + handle);
							   
	        	}
 
		driver.switchTo().window(parentHandle); 
		Thread.sleep(5000);
		driver.close();
	}	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
				
    }
}
