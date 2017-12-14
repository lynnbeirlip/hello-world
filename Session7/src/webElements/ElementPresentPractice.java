package webElements;

import java.util.List;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPresentPractice {

	WebDriver driver;
	String baseURL = "https://letskodeit.teachable.com/p/practice";
	
	public ElementPresentPractice(WebDriver driver) {
		this.driver = driver;
		driver.get(baseURL);
		if(driver.findElements(By.xpath(".//*[@id='checkbox-example']/fieldset")).size() != 0){
			System.out.println("Element is Present");
			}else{
				System.out.println("Element is Absent");
			}
		}
	
	//public boolean isElementPresent(String locator, String type) {
		
	    //int size = elementList.size();
	    
	    //if (size > 0) {
	    	//return true;
	    //}
	    //else {
	    	//return false;
	    //}
	//}
}