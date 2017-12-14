package advancedReportingPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

@Test
public class FirstTestNGReporting {
	public String baseUrl = "http://newtours.demoaut.com/";
    String driverPath = "C:\\Selenium\\chromedriver.exe";
	public WebDriver driver;

	
  public void verifyHomepageTitle() {
	  
    System.out.println("launching chrome browser"); 
    driver = new ChromeDriver();
    driver.get(baseUrl);
  	ExtentReports extent;
  	ExtentTest test;
  	extent = new ExtentReports("C:\\Users\\lynn.bierl\\workspace\\Session12b");
    test = extent.createTest("Verify welcome text");


    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
    driver.close();
  }
}
