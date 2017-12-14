package newpackage;

import org.openqa.selenium.webdriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum MyClass {
  String baseURL = "http://www.google.com";
  webDriver driver;
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\lynn.bierl\\workspace\\chromedriver.exe");
  driver = new ChromeDriver();
  
  driver.get(baseURL);
}