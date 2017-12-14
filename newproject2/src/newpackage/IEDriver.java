package newpackage;


public class IEDriver {
	public static void main(String[] args) {
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
	System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
	driver = new IEDriverServer();
	
	driver.get(baseURL);		

	}

}
