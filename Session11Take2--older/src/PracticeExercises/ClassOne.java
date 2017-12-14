package PracticeExercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ClassOne {
	static WebDriver driver;
    String actualTitle;

    @Test
    public void test() {
    	WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
    	actualTitle = driver.getTitle();
       System.out.println("ActualTitle is " + actualTitle );
                     }
      @BeforeClass
      public static void Beforeclass() {
    	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
    	  driver = new ChromeDriver();
       }
      @AfterClass
      public static void Afterclass() {
    	  driver.quit();
      }
}
	
