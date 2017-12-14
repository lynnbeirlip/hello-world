package windowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.ui.Window;

public class switchingiFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;	
			
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();
	
		//Switch by frame index
		driver.switchTo().frame(0);
		System.out.println("The webpage has switched to iframe0 by index");	
		
		//Switch by frame name
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.switchTo().frame("iframe1");
		System.out.println("The webpage has switched to iframe1 by name");
		
		//Switch by frame id
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.switchTo().frame("IF2");
		System.out.println("The webpage has switched to iframe2 by id");
		
		//Switch by xPath
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='IF2']")));
		driver.quit();
		System.out.println("The webpage has switched to iframe1 by xPath");
		
		//Switch by frame name
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.switchTo().frame("iframe2");
		System.out.println("The webpage has switched to iframe2 by name");
		
	} 
	
	public void tearDown() throws Exception {
		Thread.sleep(10000);
			
		}
}


