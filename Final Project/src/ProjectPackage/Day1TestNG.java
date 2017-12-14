package ProjectPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Day1TestNG {
  @Test
  public void f() {
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
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
