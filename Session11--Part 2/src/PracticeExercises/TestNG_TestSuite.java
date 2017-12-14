package PracticeExercises;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_TestSuite {
	private WebDriver driver;
	private String baseUrl;
	static Logger log = Logger.getLogger("TestNG_TestSuite.class");
	
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  baseUrl = "https://www.expedia.com/";
  }
  
  @Test
  public void test() {   
	  //Maximize the browser's window
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //PropertyConfigurator.configure("log4j.properties");
	  driver.get(baseUrl);
  }
}
