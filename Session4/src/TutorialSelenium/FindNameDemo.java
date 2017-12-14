package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNameDemo {

	public static void main(String[] args) {
		// TODO Initiate Amazon search
		String baseURL = "http://www.amazon.com";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

		driver.findElement(By.name("field-keywords")).sendKeys("ford mustangs for sale");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
        }
}
	    