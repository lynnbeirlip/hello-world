package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.amazon.com";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);


		driver.findElement(By.linkText("Today's Deals")).click();}
	
	}
