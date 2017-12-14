package TravelPlans;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

public class FlightReservations {
	private WebDriver driver;
	private String baseUrl;
	private boolean accepttextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\lynn.bierl\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		baseUrl = ("http://newtours.demoaut.com/");
		//String baseHandle = driver.getWindowHandle();
		//System.out.println("The current URL is: " + baseUrl);
		//System.out.println("The window handle of the current page is: " + baseHandle);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void registerUser() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		  System.out.println("launching firefox browser"); 
	      //driver = new FirefoxDriver();   
	      driver.get(baseUrl);
	      String baseHandle = driver.getWindowHandle();
	      System.out.println("The current URL is: " + baseUrl);
	      System.out.println("The window handle of the current page is: " + baseHandle);
	      
	      //Register as a new user
	      driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	      // Store the current window handle
	      String winHandleBefore = driver.getWindowHandle();
	      System.out.println("The current URL is " + baseUrl);
	      System.out.println("The window handle of the base URL is " + winHandleBefore);
	      
	      // Perform the click operation that opens new window
	      driver.findElement(By.linkText("REGISTER")).click();
	
		// Switch to new window opened
	      String newHandle = driver.getWindowHandle();
	      driver.switchTo().window(newHandle);
	      System.out.println("The window handle of the new page is " + newHandle);
		
		// Perform the actions on new window
	      
	      System.out.println("The current URL from the Test module is: " + baseUrl);
	      //System.out.println("The window handle of the current page is: " + winHandle);
		
		//String usersetupHandle = driver.getWindowHandle();
		//driver.switchTo().window(usersetupHandle);
		//System.out.println("The current window handle is " + usersetupHandle);
		//System.out.println("")
		//driver.get(baseUrl + "/mercuryregister.php?osCsid=fb2f17f9111a552946f5dd7ed15b5ccc");
		//driver.findElement(By.name("firstName")).clear();
		//driver.findElement(By.name("firstName")).sendKeys("System");	
		//driver.findElement(By.name("lastName")).clear();
		//driver.findElement(By.name("lastName")).sendKeys("Tester4");
		//driver.findElement(By.name("phone")).clear();
		//driver.findElement(By.name("phone")).sendKeys("513-555-4321");		
		//driver.findElement(By.name("userName")).clear();
		//driver.findElement(By.name("userName")).sendKeys("systemtester4");	
		//driver.findElement(By.name("address1")).clear();
		//driver.findElement(By.name("address1")).sendKeys("555 Main Street");		
		//driver.findElement(By.name("address2")).clear();
		//driver.findElement(By.name("address2")).sendKeys("Apt. 2B");	
		//driver.findElement(By.name("city")).clear();
		//driver.findElement(By.name("city")).sendKeys("Cincinnati");	
		//driver.findElement(By.name("state")).clear();
		//driver.findElement(By.name("state")).sendKeys("OH");	
		//driver.findElement(By.name("postalCode")).clear();
		//driver.findElement(By.name("postalCode")).sendKeys("45238");
		//driver.findElement(By.name("email")).clear();
		//driver.findElement(By.name("email")).sendKeys("systemtester4");
		//driver.findElement(By.name("password")).clear();
		//driver.findElement(By.name("password")).sendKeys("testmercury4");
		//Need to find a way to represent clicking the Enter key when an alert is displayed. There is no OK or cancel buttons on the alert.
		//new WebDriverWait(driver, 5).until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.name("confirmPassword")).clear();
	//	driver.findElement(By.name("confirmPassword")).sendKeys("testmercury4");
		
	
		//driver.findElement(By.name("register)")).click();
		//It is not clicking on the button to go to the registration page
		//for (String handle : driver.getWindowHandles()) {
			//driver.switchTo().window(handle);
		//driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")).click();
		//driver.findElement(By.linkText("mercurysignon.php")).click();
		
		
		//}
			
	}

	//@Test
	//public void testLogin() throws Exception {
	//Switch to new window
		//for (String loginHandle : driver.getWindowHandles()) {
			//driver.switchTo().window(loginHandle);
		//}
	//Log in to site
		//driver.findElement(By.name("userName")).clear();
		//driver.findElement(By.name("userName")).sendKeys("systemtester3");
		//driver.findElement(By.name("password")).clear();
		//driver.findElement(By.name("password")).sendKeys("testmercury3");
		
		//}
//	@Test
	//public void testBookingFRS() throws Exception {
		//Book reservation
		//I would prefer to figure out how to have the user click on the "sign-in" link on http://newtours.demoaut.com/create_account_success.php, but cannot find a way to identify the field.
		
		//for (String bookingHandle : driver.getWindowHandles()) {
			//driver.switchTo().window(bookingHandle);
		//driver.get(baseUrl  + "/mercurysignon.php");
		//driver.findElement(By.name("userName")).clear();
	//	driver.findElement(By.name("userName")).sendKeys("systemtester3)");		
		//driver.findElement(By.name("password")).clear();
		//driver.findElement(By.name("password")).sendKeys("testmercury3");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.cssSelector("font > font > input[name=\"servClass\")")).click();
		//driver.findElement(By.name("findFlights")).click();
		//driver.findElement(By.name("reserveFlights")).click();
		//driver.findElement(By.name("passFirst0")).clear();
		//driver.findElement(By.name("passFirst0")).sendKeys("System");
		//driver.findElement(By.name("passLast0")).clear();
		//driver.findElement(By.name("passLast0")).sendKeys("Tester1");
		//driver.findElement(By.name("creditnumber")).clear();
		//driver.findElement(By.name("creditnumber")).sendKeys("4255128058629601");
		//driver.findElement(By.name("buyFlights")).click();

	//}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		

}
