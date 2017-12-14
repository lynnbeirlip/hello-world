package PracticeExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class usingAsserts {
	String actualTitle;

	@Test
	public void testNGAsserts1() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//lynn.bierl//Downloads//geckodriver-v0.15.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Test Condition 1: If Page title matches with expectedTitle then it finds email title and enters the value which we pass
		driver.get("https://www.gmail.com");
		String expectedTitle = "Gmail";
		actualTitle = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		System.out.println("This test pass");
		//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("SoftwareTestingMaterial.com");
		driver.close();
		
	}
	
	//@Test
	//public void testNGAsserts3() {
	//WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.gmail.com");
		//String actualTitle = driver.getTitle(); 
		//System.out.println("Your page title Is : "+ actualTitle);
		//String expectedTitle = "Gmail";
		//Assert.assertEquals(expectedTitle,actualTitle,"Actual title matches expected");
	//}

	//@Test
	//public void testNGAsserts4() {
		//driver= new FirefoxDriver();
		//driver.navigate().to("https://www.gmail.com");
		//Assert.assertEquals("Gmail", driver.getTitle(), "Strings are not matching");
		//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		//Assert.assertTrue(isUserLoggedInSuccessfully(), "User failed to login");
		//Assert.assertFalse(isUserLoggedOut())
		//}

	
	
	
	
	
	
	
	
	//@Test
	//public void testNGAsserts2() throws InterruptedException {
		//Test Condition 2: If page title didn't match with expectedTitle then script throws an exception
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.gmail.com");
		//String expectedTitle2 = "GoogleMail";
		//Thread.sleep(2000);
		//Assert.assertEquals(driver.getTitle(), expectedTitle2, "Actual title does not match expected title");
		//Assert.assertEquals(driver.getTitle(), expectedTitle2);
	//}

}
