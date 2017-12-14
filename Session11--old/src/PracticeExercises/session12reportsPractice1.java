package PracticeExercises;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class session12reportsPractice1 {
	private WebDriver driver; 
	ExtentReports report;  
	ExtentTest test;
	report = new ExtentReports("//Users//lynn.bierl//workspace//Session11//reportoutput");
	test = report.startTest("Verify the test has started.");
	
	//@BeforeClass
	//public void BeforeClass() {
		//report = new ExtentReports("//Users//lynn.bierl//workspace//Session11//reportoutput");
		//test = report.startTest("Verify the test has started.");
	//}
	
    @Test(dependsOnMethods = { "testTwo", "testThree" })
    public void testOne() {
        System.out.println("Test method one");
    }
 
    @Test
    public void testTwo() {
        System.out.println("Test method two");
    }
 
    @Test
    public void testThree() {
        System.out.println("Test method three");
    }
}
