package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class Test2 {
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Manisha";
		AssertJUnit.assertEquals(message, messageUtil.salutationMessage());
	}

}
