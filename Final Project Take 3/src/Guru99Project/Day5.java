package Guru99Project;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Properties;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.poi.hwpf.usermodel.Table;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {
  
	public WebDriver driver;
	String baseUrl;
	
	@BeforeClass
	public void beforeClass1(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = ("http://www.demo.guru99.com/V4/");
		System.out.println("The @BeforeClass method has run.");
	}
	
  
	
	@DataProvider(name="userLogin")
	public static Object[][] getloginData() throws Exception{
		String filePath = "C:/Users/lynn.bierl/Input_for_final_project.xlsx";
		String sheetName = "Sheet1";
		Table LoginTable = null;
		Object[][] arrayObject = getExcelData(filePath, sheetName);
		//getExcelData excelRecord = new getExcelData();
		return arrayObject;
	}
	
	public static Object[][] getExcelData(String filePath, String sheetName) throws Exception{
		Object[][] arrayExcelData = null;
		try {
			System.out.println("Retrieving the Excel data now.");
			
			// Specify the path of file
			System.out.println("Filepath is " + filePath);
			
		    // load file
		    FileInputStream fis=new FileInputStream(filePath);
		    System.out.println(fis);
			  
		    // Load workbook
		    XSSFWorkbook wb = new XSSFWorkbook(fis);
		    System.out.println(wb);
		    
		    // Load sheet- Here we are loading first sheet only
		    XSSFSheet sh1= wb.getSheet(sheetName);
		    System.out.println(sh1);
		    int numberOfRows = sh1.getPhysicalNumberOfRows();
		  
		    arrayExcelData = new Object[numberOfRows][2];

		  for (int row = 1; row < (numberOfRows); row++) {			  				
		// Pulls username and password data from excel file and converts to String
				String userId = sh1.getRow(row).getCell(0).getStringCellValue();
				String passCode = sh1.getRow(row).getCell(1).getStringCellValue();
				
				arrayExcelData[row-1][0] = userId;
				arrayExcelData[row-1][1] = passCode;
				
		
		

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}
		return arrayExcelData;
	}
	
	@Test(dataProvider="userLogin")
	public void AttemptLogin(String userID, String password) throws InterruptedException {
	
		System.out.println("Attempting to log in now.");
		driver.get(baseUrl);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		// Finds username field  	
		WebElement loginID = driver.findElement(By.name("uid"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 // Sends string from excel sheet to username field
		 	loginID.sendKeys(userID);
		 	System.out.println("Username " + userID + " entered");
		 	
		 // Finds password field		  
			  WebElement passWord = driver.findElement(By.name("password"));
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
		// Sends string from excel sheet to password field
			  passWord.sendKeys(password);
			  System.out.println("Password " + password + " entered");
			  	
		// Finds and clicks "Submit" button			  	
			  driver.findElement(By.name("btnLogin")).click();
			  
		// If alert present, accepts alert and prints out message
			  if (isAlertPresent() == true) {
				  driver.switchTo().alert().accept();
				  System.out.println("Login failed! Try Again!");
				  Thread.sleep(2000);
			  } 
		// If alert not present, prints out message
			  else  {
				//Verify the Manager ID is displayed in the welcome message
					 String expectedMessage1 = ("Welcome to Manager's Page of Guru99 Bank");
				  	 String expectedMessage2 = ("Manger ID : " + userID);
					 String actualMessage1 = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
					 System.out.println("The first login confirmation message is: " + actualMessage1);
					 String actualMessage2 = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
					 System.out.println("The second login confirmation messsage is: " + actualMessage2);
					 					 
					 Assert.assertTrue(expectedMessage1.equalsIgnoreCase(actualMessage1));
					 Assert.assertTrue(expectedMessage2.equalsIgnoreCase(actualMessage2));
				  
					 System.out.println("The welcome message is: " + actualMessage1 + actualMessage2);
					 System.out.println("Login Successful!");
					 Thread.sleep(2000);
				  
			  }

//	} catch (Exception e) {

//			  System.out.println(e.getMessage());

}

// Method to determine if alert pop-up present
	public boolean isAlertPresent() {
	  
	  try {
		  driver.switchTo().alert();
		  return true;
	  }
	  catch (NoAlertPresentException Ex) {
		  return false;
	  }
}

 
	@AfterClass
  public void afterClass() {
  }

}
