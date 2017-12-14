package TutorialSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameExample {          
	public static void main(String[] args) {
    String baseURL = "http://www.google.com";
    WebDriver driver;                          
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(baseURL);
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("This webpage includes the following links" + links);
    driver.close();
	}
}


