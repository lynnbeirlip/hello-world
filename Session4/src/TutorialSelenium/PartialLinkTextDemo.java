package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
						
		String baseURL = "http://www.amazon.com";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("day's Deals")).click();}
			
	}
