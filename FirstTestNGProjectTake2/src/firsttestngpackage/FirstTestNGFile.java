package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	public String baseUrl = "http://newtours.demoaut.com/";
    String driverPath = "C:\\Selenium\\chromedriver.exe";
	public WebDriver driver;
	
	
  @Test
  public void verifyHomepageTitle() throws InterruptedException {
      
	  System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      
      //Adding 10 second pause so we can see the Mercury Tours site open
      TimeUnit.SECONDS.sleep(10);
      driver.close();
  }
}
