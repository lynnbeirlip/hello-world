package webElements;
		// TODO Auto-generated method stub

		import java.util.List;
import java.util.concurrent.TimeUnit;

		import org.junit.After;
		import org.junit.Before;
		import org.junit.Test;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		
		public class ElementPresencePractice {
			private WebDriver driver;
			private String baseUrl;
			private GenericMethods gm;
			

			@Before
			public void setUp() throws Exception {
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");   
				driver = new ChromeDriver();
				baseUrl = ("http://letskodeit.teachable.com/pages/practice");
				gm = new GenericMethods(driver);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
			}
		
			@Test
			public List<WebElement> getElementList() {
				driver.get(baseUrl);
				
				if(driver.findElements(By.xpath(".//*[@id='checkbox-example']/fieldset")).size() != 0){
					System.out.println("Element is Present");
					}else{
						System.out.println("Element is Absent");
					}
				}
				
	
			public boolean isElementPresent(String locator, String type) {
				List<WebElement> elementList = getElementList();
				int size = elementList.size();
				
				boolean result =
				
				if (size > 0) {
					return true;
				}
				else {
					return false;
							
				}
				
			}
			
			//private void If(boolean b) {
				// TODO Auto-generated method stub
				
			//}

			@After
			public void tearDown() throws Exception {
				Thread.sleep(3000);
				driver.quit();
			}

	}
