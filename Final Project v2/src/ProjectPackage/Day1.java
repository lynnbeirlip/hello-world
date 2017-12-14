package ProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String baseURL = "http://demo.guru99.com/V4";
			WebDriver driver;

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(baseURL);
			driver.findElement(By.name("uid")).sendKeys("mngr98692");
			driver.findElement(By.name("password")).sendKeys("syrunan");
			driver.findElement(By.name("btnLogin")).click();
		}
	}
