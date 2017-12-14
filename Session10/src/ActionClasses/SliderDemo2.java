package ActionClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lynn.bierl\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://jqueryui.com/slider/");
	    //driver.get("http://jqueryui.com/demos/slider/);
	    driver.manage().window().maximize();
	 
	    Actions act = new Actions(driver);
	 
	    // Script for dragging a bar across a horizontal slider
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span")); 
		Actions actions = new Actions(driver); 
		actions.moveToElement(slider).dragAndDropBy(slider, 150, 0).build().perform(); 
		System.out.println("Slide Action performed.");
				   
	    }
}

