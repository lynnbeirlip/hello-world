package windowHandles;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class referencingElements2 {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
		driver = new ChromeDriver();
		baseUrl = ("http://toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void getPersonalInfo() {
		driver.get(baseUrl);

		driver.switchTo().frame("iframe2");
					
		WebElement customerSupportImage = driver.findElement(By.xpath(".//*[@id='post-9']/div/div[2]/div/p[1]/i/a/img"));
		customerSupportImage.click();
		
				
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		System.out.println("The Customer Support image click was successful");	
		driver.quit();
	}

}

