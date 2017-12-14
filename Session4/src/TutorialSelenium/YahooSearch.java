package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearch {
	public static void main(String[] args) {
		String baseURL = "http://www.yahoo.com";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

		driver.findElement(By.id("uh-search-box")).sendKeys("summer travel deals");
		driver.findElement(By.xpath(".//*[@id='uh-search-button']")).click();  }

	
}


