package Examples;

import org.testng.annotations.Test;
import org.testng.Assert;


public class DependencyTest1UsingAnnotation {
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);
  
	
	@Test 
	public void testPrintMessage() {
	  
	  System.out.println("Inside testPrintMessage()");
	  message = "Manisha";
	  Assert.assertEquals(message, messageUtil.printMessage());
	  }
  
	@Test (dependsOnMethods = { "initEnvironmentTest" })
	public void testSalutationMessage() {
	  
	  System.out.println("Inside testSalutationMessage()");
	  message = "Hi!" + "Manisha";
	  Assert.assertEquals(message, messageUtil.salutationMessage());
	  }
	
	@Test
	public void initEnvironmentTest() {
	  
	  System.out.println("This is initEnvironmentTest()");
	  }
  
}
