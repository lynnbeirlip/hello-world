package TutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "http://only-testing-blog.blogspot.in/2013/11/new-test.html#sthash.1k1fj6QD.dpuf";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		Thread.sleep(5000);
        
		//Locating element by className and store its text to variable datentime.
		String datentime = driver.findElement(By.className("date-header")).getText();
		System.out.println("The date and time is " + datentime); 
		driver.close();}
     } 
