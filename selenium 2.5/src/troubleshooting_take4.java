
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	// TODO Auto-generated method stub
			public class troubleshooting_take4 {
				 
				public static void main(String[] args) {
					
					ChromeOptions options = new ChromeOptions();
                    options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\applications\\chrome.exe");
// Create a new instance of the Chrome driver
					
					WebDriver driver = new ChromeDriver(options);
					
			        //Launch the Online Store Website
					driver.get("http://www.google.com");
			 
			        // Print a Log In message to the screen
			        System.out.println("Successfully opened the website www.Store.Demoqa.com");
			 
					//Wait for 5 Sec
					//Thread.sleep(5);
					
			        // Close the driver
			        driver.quit();
				}


}
