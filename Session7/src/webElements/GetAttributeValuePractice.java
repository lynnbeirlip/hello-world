package webElements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetAttributeValuePractice {

	WebDriver driver;
	String baseUrl1;
	
		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			baseUrl1 = ("http://letskodeit.teachable.com/pages/practice");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		
		@Test
		public void test() {
			driver.get(baseUrl1);
			
			WebElement element = driver.findElement(By.id("product"));
			String attributeValue = element.getAttribute("class");
			
			
			System.out.println("Value of attribute is: " + attributeValue);
		}
		
		@After
		public void tearDown() throws Exception {
			Thread.sleep(3000);
			driver.quit();
		}
     
		
	}
