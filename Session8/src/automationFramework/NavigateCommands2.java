package automationFramework;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.*;
public class NavigateCommands2 {
	public static void main(String[] args) throws InterruptedException {
		
		//Set path to Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
				
		// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);
 
		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
 
		//Pause so that the user can see what is happening
		Thread.sleep(3000);
		
		// Go back to Home Page
		driver.navigate().back();
 
		//Pause so that the user can see what is happening
		Thread.sleep(3000);
				
		// Go forward to Registration page
		driver.navigate().forward();
 
		//Pause so that the user can see what is happening
		Thread.sleep(3000);
		
		// Go back to Home page
		driver.navigate().to(appUrl);
 
		//Pause so that the user can see what is happening
		Thread.sleep(3000);
		
		// Refresh browser
		driver.navigate().refresh();
 
		// Close browser
		driver.close();
	}
}
