package org.openqa.selenium;
import org.openqa.selenium.webdriver;
import org.openqa.selenium.chrome.webdriver;
public class webdriver {
  String baseURL = "http://www.google.com";
  webDriver driver;
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\lynn.bierl\\workspace\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  
  driver.get(baseURL);


}
