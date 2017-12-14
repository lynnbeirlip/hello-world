import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WildcardswithCSSSelectors1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		WebElement hideshowButton = driver.findElement(By.cssSelector(".displayed-class"));
		driver.close();
		System.out.println(hideshowButton);
		
		}

}
