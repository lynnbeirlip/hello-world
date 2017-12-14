package advancedReportingPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class FirstTestNGFile {
	public String baseUrl = "http://newtours.demoaut.com/";
    //String driverPath = "C:\\Selenium\\chromedriver.exe";
	public WebDriver driver;
	ExtentReports report;
	ExtentTest test;	
	
	
  @Test
  public void verifyHomepageTitle() throws InterruptedException {
      
	  
      report = new ExtentReports("C:\\Users\\lynn.bierl\\workspace\\Session12test\\reportoutput.html", true);
      test = report.startTest("VerifyWelcomeTest"); 
      System.out.println("launching chrome browser"); 
      driver = new ChromeDriver();
	  test.log(LogStatus.INFO,  "Mercury Tours site has been accessed");
	  test.log(LogStatus.PASS, "Title has been verified");
	 
	  
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      
      //Adding 10 second pause so we can see the Mercury Tours site open
      TimeUnit.SECONDS.sleep(10);
      driver.close();
  }
}
