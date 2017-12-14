import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Final_Project_Day_3 {
	
	static WebDriver driver;
    

    @Test
    public void test() {
  
		driver.navigate().to("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr77972");
		driver.findElement(By.name("password")).sendKeys("rAtArEp");
		driver.findElement(By.name("btnLogin")).click();
		String expectedTitle = "Guru99 Bank Manager HomePage";
		String actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    	
       System.out.println("Login successful");
                     }
    @BeforeClass
     public static void Beforeclass() {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    	  driver = new ChromeDriver();
       }
    @AfterClass
    public static void Afterclass() {
          driver.quit();
      }
}

