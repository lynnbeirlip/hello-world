package advancedReportingPractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;


public class POM_TC {

	static ExtentReports report;
	static ExtentTest test;
	
	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C://Selenium//chromedriver.exe";
		String reportPath = "C://users//lynn.bierl//workspace//Session12c//POM-test-case-report.html";
	
		report = new ExtentReports(reportPath, false);
       	test = report.startTest("VerifyLoginTest");
       	
       	System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		test.log(LogStatus.INFO, "ChromeDriver browswer has started.");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
		test.log(LogStatus.INFO, "Website access successful.");
 
        //Use page Object library
		Home_Page.lnk_MyAccount(driver).click();
		
		LogIn_Page.txtbx_UserName(driver).sendKeys("thrivetestuser_1");
		LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");
		LogIn_Page.btn_LogIn(driver).click();
		
		
		// Print a Log In message to the screen
        System.out.println("Logged in successfully, now it is time to log off.");
        test.log(LogStatus.INFO, "Login successful.");
        Home_Page.lnk_LogOut(driver).click();
        System.out.println("Logout successful");
        test.log(LogStatus.INFO, "Logout successful");
 		
        // Close the driver
        test.log(LogStatus.PASS, "Test script has passed");
        Thread.sleep(3000);
        driver.quit();
        report.endTest(test);
        report.flush();
        
    }

}
