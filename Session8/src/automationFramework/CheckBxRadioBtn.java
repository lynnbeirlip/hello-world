package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBxRadioBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String baseURL = "http://toolsqa.wpengine.com/Automation-practice-form/";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Launch the ToolsQA WebSite
		driver.get(baseURL);
		
		//Challenge #1
		WebElement radioBtn = driver.findElement(By.id("sex-1"));
		radioBtn.click();
		
		//Challenge #2
		// Store all the elements of same category in the list of WebLements
		WebElement yearsofExp = driver.findElement(By.id("exp-2"));
		yearsofExp.click();
				
		// Challenge #3
		WebElement profession = driver.findElement(By.id("profession-1"));
		profession.click();
		
		// Challenge #4
		WebElement automationTool = driver.findElement(By.id("tool-1"));
		automationTool.click();
		
		Thread.sleep(5000);
		driver.close();
	}
}	
		
				