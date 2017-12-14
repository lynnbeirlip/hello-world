package windowHandles;
 
import java.util.Set; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class PracticeSwitchWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; 	
	 
			// Create a new instance of the Chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
 			driver = new ChromeDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
 	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
 
	        // Click on the Button "Alert Box"
 	        driver.findElement(By.id("alert")).click();
 	        Thread.sleep(3000);
 	       
 
            // Switch to JavaScript Alert window
 	        Alert myAlert = driver.switchTo().alert();
 	        Thread.sleep(5000);
 
	        // Accept the Alert
 	        myAlert.accept();
 	        Thread.sleep(3000);
 
	        // Close Original window
 	        driver.close();
 
	}
 
}