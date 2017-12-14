package webElements;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class WorkingwithListElements {
 
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");		
		driver = new ChromeDriver(); 
		
		// Maximize window
		driver.manage().window().maximize();
 
		// Navigate to the URL
		driver.get("http://www.techbeamers.com");
 
		// Sleep for 5 seconds
		Thread.sleep(5000);
 
		// Here, the code below will select all rows matching the given XPath.
 		//List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='panel-2986-2-0-0']/div/div/div/table[1]/tbody/tr/td"));
		//List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='panel-2986-2-0-0']/div/div/div/table[1]/tbody/tr/td/ul"));
		//List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='panel-2986-2-0-0']/div/div/div/table[1]"));
		List<WebElement> rows = driver.findElements(By.id("pg-2986-2"));


 		//Count the number of rows in the table
 		//int rows_count = rows.size();
 
		// print the total number of elements
		System.out.println("Total selected rows are " + rows.size());

 
		// Now using Iterator we will iterate all elements
		Iterator<WebElement> iter = rows.iterator();
 
		int counter = 0; 
		// this will check whether list has some element or not
		while (iter.hasNext()) {
 
			// Iterate one by one
			WebElement item = iter.next();
			counter = counter + 1;
			 
			// get the text
			String label = item.getText();
 
			// print the text
			System.out.println("Row label is " + label);			
		}
		driver.close();
	}
}
