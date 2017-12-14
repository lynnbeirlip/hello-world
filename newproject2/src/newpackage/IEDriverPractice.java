package newpackage;

public class IEDriverPractice {

	public static void main(String[] args) {
		String baseURL = "http://www.google.com";
		WebDriver driver; 
		
	System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
	driver = new IEDriver();
	
	driver.get(baseURL);		


	}

}
