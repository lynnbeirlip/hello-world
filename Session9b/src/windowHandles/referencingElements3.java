package windowHandles;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class referencingElements3 {
	WebDriver driver;
	String baseUrl;
	//private String tableTab4;

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
		driver.switchTo().frame("IF2");
					
		//String tableTab4Text = driver.findElement(By.id("tabs-4")).getText();
		WebElement tableTab4 = (driver.findElement(By.xpath(".//*[@id='tabs-4']")));
		String Tab4Text = tableTab4.getText();
		System.out.println("The text on Tab 4 of the table is: " + Tab4Text);
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

}

