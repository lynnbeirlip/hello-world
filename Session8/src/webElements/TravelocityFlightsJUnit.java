package webElements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TravelocityFlightsJUnit {

	private static WebDriver driver;
	
	@BeforeClass
    public static void Beforeclass() {
  	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
  	  driver = new ChromeDriver();
     }
    @AfterClass
    public static void Afterclass() {
  	  driver.quit();
    }
	
	@Test
	public void test() {
		driver.navigate().to("http://www.travelocity.com/Flights");
		driver.findElement(By.id("flight-origin")).sendKeys("Cincinnati, OH");	
		driver.findElement(By.xpath("//input[@id='flight-destination']")).clear();
		driver.findElement(By.xpath("//input[@id='flight-destination']")).sendKeys("Fort Lauderdale, FL");		
		driver.findElement(By.id("flight-departing")).sendKeys("12/01/2017");
		driver.findElement(By.id("flight-returning")).sendKeys("12/09/2017");
		
		//Select number of adults
		WebElement dropElement = driver.findElement(By.id("flight-adults"));
		Select dropdown = new Select(dropElement);
		dropdown.selectByVisibleText("2");
		driver.findElement(By.id("flight-adults")).click();
			
		//Select number of children
		WebElement dropElement2 = driver.findElement(By.id("flight-children"));
		Select dropdown2= new Select(dropElement2);
		dropdown2.selectByVisibleText("2");
		driver.findElement(By.id("flight-children")).click();
			
		//Specify children's ages
		WebElement dropElement3 = driver.findElement(By.id("flight-age-select-1"));
		Select dropdown3 = new Select(dropElement3);
		dropdown3.selectByVisibleText("12");
		driver.findElement(By.id("flight-age-select-1")).click();
		
		WebElement dropElement4 = driver.findElement(By.id("flight-age-select-2"));
		Select dropdown4 = new Select(dropElement4);
		dropdown4.selectByVisibleText("9");
		driver.findElement(By.id("flight-age-select-2")).click();
		
		//Click on Search button
		driver.findElement(By.id("search-button")).click();
	}

}
