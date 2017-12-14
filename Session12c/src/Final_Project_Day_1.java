import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Final_Project_Day_1 {
	
	static WebDriver driver;
    

    @Test
    public void test() {
  
    	WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr77972");
		driver.findElement(By.name("password")).sendKeys("rAtArEp");
		driver.findElement(By.name("btnLogin")).click();
    	
       System.out.println("Login successful");
                     }
    @BeforeClass
     public static void Beforeclass() {
    	  System.setProperty("webdriver.gecko.driver","C:\\Users\\lynn.bierl\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	  driver = new FirefoxDriver();
       }
      @AfterClass
      public static void Afterclass() {
    	  driver.quit();
      }
}

