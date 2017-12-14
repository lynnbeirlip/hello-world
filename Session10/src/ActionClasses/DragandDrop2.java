package ActionClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {
	
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lynn.bierl\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	 
	    Actions act = new Actions(driver);
	 
	    // Script for dragging an element and dropping it in another place
	    WebElement iFrame = driver.findElement(By.tagName("iframe"));
	    driver.switchTo().frame(iFrame);
	 
	    WebElement From = driver.findElement(By.id("draggable"));
	 
	    WebElement To = driver.findElement(By.id("droppable"));
	 
	    act.clickAndHold(From).build().perform();
	    act.moveToElement(To).build().perform();
	    act.release(To).build().perform();
	    Thread.sleep(5000);
	    driver.quit();
	    
	 
	    }
}
