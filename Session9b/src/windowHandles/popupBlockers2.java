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

public class popupBlockers2 {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
		driver = new ChromeDriver();
		baseUrl = ("http://downloads.smartbear.com/samples/testcomplete10/dialogs/");
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void AlertOK() throws InterruptedException {
			
		//Handle alert pop-up
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[1]")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
	}
		
	@Test
	public void ConfirmOK() throws InterruptedException {
		
		//Accept confirm pop-up by clicking "OK"
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[3]")).click();
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(confirm.getText());
		confirm.accept();
	}	
	
	@Test
	public void ConfirmCancel() throws InterruptedException {
		
		//Dismiss confirm pop-up by clicking "Cancel"
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[3]")).click();
		Alert cancel = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(cancel.getText());
		cancel.dismiss();
	}	
		
	@Test
	public void PromptOK() throws InterruptedException {
		
		//Handle prompt pop-up by entering a name, checking the “Prevent this page from creating additional dialogs” box, and clicking on the "OK" button.
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[2]")).click();
		Alert promptconfirm = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Sara Student");
		Thread.sleep(3000);
		System.out.println(promptconfirm.getText());
		promptconfirm.accept();
	}			
	
	@Test
	public void PromptCancel() throws InterruptedException {
		
		//Handle prompt pop-up by clicking the Cancel button 
		driver.findElement(By.xpath(".//*[@id='dialogBox']/a[2]")).click();
		Alert promptcancel = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("You hit cancel");
		Thread.sleep(3000);
		System.out.println(promptcancel.getText());
		promptcancel.dismiss();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		//WebElement submitButton = driver.findElement(By.id("submit"));
		//submitButton.click();
     		
		//System.out.println("Once the form is filled out and the Submit button is hit, the form will clear.");	
		
		driver.quit();
	}
}
