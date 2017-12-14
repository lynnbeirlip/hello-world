package advancedReportingPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ClassOne {
	WebDriver driver;
    String actualTitle;
    ExtentReports report;
    ExtentTest test;

    @BeforeClass
    public void beforeClass() {
  	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
  	  driver = new ChromeDriver();
  	  report = ExtentFactory.getInstance();
  	  test.log(LogStatus.INFO, "Declared new driver, initialized report, and set instance.");
     }
    
    @Test
    public void test1_verify_title() {
    	test = report.startTest("VerifyWelcomeTest");
    	test.log(LogStatus.INFO, "Started reporting on multiple test cases");
		driver.navigate().to("http://google.com");
    	actualTitle = driver.getTitle();
        System.out.println("ActualTitle is " + actualTitle );
        test.log(LogStatus.PASS, "Actual title is " + actualTitle);
     }

     @AfterClass
     public void afterTest() {
    	 driver.quit();
    	 report.endTest(test);
    	 report.flush();

      }
}
	
