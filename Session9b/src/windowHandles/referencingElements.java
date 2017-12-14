package windowHandles;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class referencingElements {
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

		driver.switchTo().frame("iframe1");
					
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Dana");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Davis");
		
		WebElement gender = driver.findElement(By.id("sex-0"));
		gender.click();

		WebElement experience = driver.findElement(By.id("exp-3"));
		experience.click();
		
		WebElement currentdate = driver.findElement(By.id("datepicker"));
		currentdate.sendKeys("10/01/2017");
		
		WebElement profession = driver.findElement(By.id("profession-1"));
		profession.click();
		
		WebElement automationTool = driver.findElement(By.id("tool-1"));
		automationTool.click();
			
		WebElement continents = driver.findElement(By.id("continents"));
		continents.sendKeys("North America");
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
     		
		System.out.println("Once the form is filled out and the Submit button is hit, the form will clear.");	

		
		driver.quit();
	}

}

