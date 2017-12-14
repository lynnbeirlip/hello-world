package advancedReportingPractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FirstTestNGFile {
	public String baseUrl = "http://newtours.demoaut.com/";
    String driverPath = "C:\\Selenium\\chromedriver.exe";
	public WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	
  @Test
  public void verifyHomepageTitle() throws InterruptedException {
      
	  //If end with "true", it will overwrite the report file; "false" will add to the existing file if it exists
	  report = new ExtentReports("C:\\Users\\lynn.bierl\\workspace\\Session12c\\reportoutput.html", true);
	   test = report.startTest("VerifyWelcomeTest");
	  System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  test.log(LogStatus.INFO, "Browser started");
      driver.get(baseUrl);
      test.log(LogStatus.INFO, "Mercury Tours site has been accessed");
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      test.log(LogStatus.PASS, "Title has been verified");
      
      //Adding 10 second pause so we can see the Mercury Tours site open
      TimeUnit.SECONDS.sleep(10);
      
    		  
      driver.close();
      report.endTest(test);
      report.flush();
  }
}
