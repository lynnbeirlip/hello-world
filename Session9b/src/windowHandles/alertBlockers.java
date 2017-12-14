package windowHandles;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class alertBlockers {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
		driver = new ChromeDriver();
		baseUrl = ("http://downloads.smartbear.com/samples/testcomplete10/dialogs/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void getPersonalInfo() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);		
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[1]")).click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);		
		driver.findElement(By.xpath(".//*[@id='dialogBox']/h3[4]")).click();
		Thread.sleep(2000);
		
		Alert confirm=driver.switchTo().confirm();
		System.out.println(confirm.getText());
		Thread.sleep(2000);
		confirm.accept();
		Thread.sleep(2000);
	
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);		
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[2]")).click();
		Thread.sleep(2000);
		
		Alert prompt=driver.switchTo().prompt();
		driver.switchTo().alert().sendKeys("Dana Analyst");
		Thread.sleep(2000);
		prompt.accept();
		Thread.sleep(2000);
	
		
		//WebElement confirmSample = driver.findElement(By.xpath(".//*[@id='dialogBox']/a[3]"));
			
		//WebElement promptSample = driver.findElement(By.xpath(".//*[@id='dialogBox']/a[2]"));
		//promptSample.click();

		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		     		
		//driver.quit();
	}

}

