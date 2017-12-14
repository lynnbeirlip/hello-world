package PracticeExercises;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class captureScreenshot {
  @Test
  public static void captureScreenMethod() throws Exception{
      System.setProperty("webdriver.gecko.driver","C:\\Users\\lynn.bierl\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().window().maximize();
      try{
    	  driver.get("http://www.softwaretestingmaterial.com");
    	  driver.navigate().refresh();
    	  //driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
    	  driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); 
    	  //Statement with incorrect Xpath	
      	}catch(Exception e){
      		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      		FileUtils.copyFile(screenshotFile, new File("C:\\Selenium\\SoftwareTestingMaterial.png"));
      	}
      driver.close();
      driver.quit();		
  }
}
  
 
