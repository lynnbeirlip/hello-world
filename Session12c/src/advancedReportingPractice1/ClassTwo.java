package advancedReportingPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ClassTwo {
	WebDriver driver;
    String actualTitle;
    ExtentReports report;
    ExtentTest test;

    @BeforeClass
    public void Beforeclass() {
  	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  report = ExtentFactory.getInstance();
  	  test.log(LogStatus.INFO, "Declared new driver, initialized report, and set instance.");
     }
    
    @Test
    public void test2_verify_title() {
    	test = report.startTest("VerifyWelcomeTest");
    	test.log(LogStatus.INFO, "Started reporting on multiple test cases");
    	WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://amazon.com");
    	actualTitle = driver.getTitle();
        System.out.println("ActualTitle is " + actualTitle );
        test.log(LogStatus.PASS, "Actual title is " + actualTitle);
        test.log(LogStatus.FAIL, "Test case failed");
                     }
      
     @AfterClass
     public void Afterclass() {
    	  driver.quit();
    	  report.endTest(test);
    	  report.flush();
      }
}
	
