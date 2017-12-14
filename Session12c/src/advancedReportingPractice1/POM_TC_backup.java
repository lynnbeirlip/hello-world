package advancedReportingPractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

/**
 * @author lynn.bierl
 *
 */
public class POM_TC_backup {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C:\\Selenium\\chromedriver.exe";

		
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        //Use page Object library
		Home_Page.lnk_MyAccount(driver).click();
		
		LogIn_Page.txtbx_UserName(driver).sendKeys("thrivetestuser_1");
		LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");
		LogIn_Page.btn_LogIn(driver).click();
		
		
		// Print a Log In message to the screen
        System.out.println("Logged in successfully, now it is time to log off.");
        Home_Page.lnk_LogOut(driver).click();
 		
        // Close the driver
        driver.quit();
    }

}
