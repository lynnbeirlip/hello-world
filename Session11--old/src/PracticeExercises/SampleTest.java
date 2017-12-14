package PracticeExercises;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
    @BeforeMethod
    public void BeforeMethodOne(){
    	System.out.println("This is BeforeMethodOne.");
    }
	  
    @BeforeMethod
    public void BeforeMethodFive(){
    	System.out.println("This is BeforeMethodFive.");
    }
	
    @Test
    public void testMethodTwo(){
    	System.out.println("This is testMethodTwo.");
    }
	 
    @Test(dependsOnMethods={"testMethodTwo"})
        public void testMethodThree(){
        Assert.assertTrue(true);
    }
}