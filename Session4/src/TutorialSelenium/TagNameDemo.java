package TutorialSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {
	
	public static void main(String[] args) {
	
	String baseURL = "http://www.google.com";
	WebDriver driver;

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(baseURL);

	List<WebElement> buttons = driver.findElements(By.tagName("a"));
	int size = driver.findElements(By.tagName("a")).size();
	
	System.out.println("This returned a list of " + size + " elements.");
	}
}
