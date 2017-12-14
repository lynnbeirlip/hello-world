package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameExample {

	public static void main(String[] args) {
		String baseURL = "http://www.yammer.com";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

        driver.findElement(By.className("yj-public-page--header-login")).click();}
     } 