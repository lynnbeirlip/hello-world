package Examples;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MultipleTest2NoPriority {

	public WebDriver driver;
	 
	  @Test (priority = 0)
	 
	  public void One() {
	 
	      System.out.println("This is the Test Case number One");
	 
	  }
	 
	  @Test(priority = 1)
	 
	  public void Two() {
	 
		  System.out.println("This is the Test Case number Two");
	 
	  }
	 
	  @Test 
	 
	  public void Three() {
	 
		  System.out.println("This is the Test Case number Three");
	 
	  }
	 
	  @Test 
	 
	  public void Four() {
	 
		  System.out.println("This is the Test Case number Four");
	 
	  }
	 
}
