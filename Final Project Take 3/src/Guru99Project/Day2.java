package Guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import bsh.util.Util;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String actualTitle;
		String expectedTitle;
		String actualBoxtitle;
		
		String baseURL = "http://demo.guru99.com/V4";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.name("uid")).clear(); // Good practice to clear a field before use
		driver.findElement(By.name("uid")).sendKeys("mngr98692");
	 	driver.findElement(By.name("password")).clear(); // Good practice to clear a field before use
		driver.findElement(By.name("password")).sendKeys("syrunan");
		driver.findElement(By.name("btnLogin")).click();
		
		//Verify the title of the home page
		 expectedTitle = ("Guru99 Bank Manager HomePage");
		 actualTitle = driver.getTitle();
		 System.out.println("The actual title is " + actualTitle);
		 Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle), "Test case passed.");
		 			
		Thread.sleep(3000);
		driver.quit();
	}
}
	
		
	
