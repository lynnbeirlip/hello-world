package webElements;
		// TODO Auto-generated method stub

		import java.util.concurrent.TimeUnit;

		import org.junit.After;
		import org.junit.Before;
		import org.junit.Test;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		
		public class GetTextonElementPractice {
			WebDriver driver;
			String baseUrl;

			@Before
			public void setUp() throws Exception {
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
				driver = new ChromeDriver();
				baseUrl = ("http://letskodeit.teachable.com/pages/practice");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
			}
		
			@Test
			public void testGetTextDemo() {
				driver.get(baseUrl);
				
				WebElement checkboxElement = driver.findElement(By.id("checkbox-example"));
				    String elementText = checkboxElement.getText();

					     System.out.println("Text on the element is: " + elementText);



			}

			@After
			public void tearDown() throws Exception {
				Thread.sleep(3000);
				driver.quit();
			}

	}
