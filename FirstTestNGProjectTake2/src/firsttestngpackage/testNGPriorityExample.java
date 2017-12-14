package firsttestngpackage;

import org.testng.annotations.*;

public class testNGPriorityExample {
	
	@Test(priority = 0)
	public void registerAccount()
	{
		System.out.println("First register your account");
	}
	
	@Test(priority = 2)
	public void sendEmail()
	{
		System.out.println("Send email after login");
	}

	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login to the account after registration");
	}
}
