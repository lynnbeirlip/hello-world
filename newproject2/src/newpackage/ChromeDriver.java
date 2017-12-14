package newpackage;

import org.openqa.selenium.WebDriver;

public class ChromeDriver {

	public static void main(String[] args) {
    String baseURL = "http://www.google.com";
    WebDriver driver;
    
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    driver = new ChromeDriver(); 
    
    driver.get(baseURL);

	}

}
