/**
 * 
 */
package windowHandles;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author lynn.bierl
 *
 */
String baseUrl1;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	
	public class getWindowHandles {
	WebDriver driver;
	driver = new FirefoxDriver();
	baseUrl = "http://phptravels.com/demo/";
	driver.get(baseUrl);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement homepageLink = driver.findElement(By.class("btn btn-primary btn-lg btn-block"));
		homepageLink.click();

		
	}

}
