package webElements;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.support.ui.Select;
public class EbaySearch2017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
			//*Setting property of a system variable used by chrome driver*/
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			String url = "http://www.ebay.in";
		
			
			//To maximise the browser
			driver.manage().window().maximize();
			
		   //driver.manage().deleteAllCookies();
			
			driver.get(url);
			
			driver.findElement(By.id("gh-ac")).sendKeys("Apple Watch");
			
			WebElement dropElement = driver.findElement(By.id("gh-cat"));
			
			Select dropdown = new Select(dropElement);
			
			dropdown.selectByVisibleText("Watches");
			driver.findElement(By.id("gh-btn")).click();
			
			String result =	driver.findElement(By.className("listingscnt")).getText();
		
			System.out.println("Result is: "+ result);
		

		}
	

	}
