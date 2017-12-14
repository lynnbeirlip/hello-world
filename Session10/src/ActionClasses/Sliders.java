package ActionClasses;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {
	
	private static ChromeDriver driver;
	
	@BeforeClass
	public static void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void AfterClass() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void slide() throws Exception
	{
		driver.get("http://jqueryui.com/demos/slider/");
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/iframe")));
		Thread.sleep(2000);
		WebElement draggable = driver.findElement(By.className("ui-slider-handle"));
		new Actions(driver).dragAndDropBy(draggable, 120, 0).build().perform();
		Thread.sleep(5000);
		//driver.close();
	}
}
