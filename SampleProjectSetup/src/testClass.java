import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) {
		String baseURL = "http://www.amazon.com";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machines");
	    driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click(); }
   	}


