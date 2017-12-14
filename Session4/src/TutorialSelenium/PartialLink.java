package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PartialLink {
	public static void main(String[] args) throws Exception {
		String baseURL = "http://www.gillscarwash.com";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

		driver.findElement(By.linkText("Services")).click();
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Deals")).click(); }

}
