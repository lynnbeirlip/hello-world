package Guru99Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class linkCheck {
	
	WebDriver driver;
	  String baseURL;
	  File src;
	  FileInputStream FIS;
	  FileOutputStream FOS;
	  XSSFWorkbook wb;
	  XSSFSheet Sheet1;
		@BeforeClass
	  public void navigating_to_page() throws IOException, FileNotFoundException, NullPointerException{
		//Setting up Chrome.
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//Setting up URL.
		baseURL = "http://www.thrivecincinnati.com/";
		
		//Navigate to URL.
		driver.get(baseURL);
		
		//maximize the browser window
		driver.manage().window().maximize();
		//wait for load
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Login Successful!");  
	  }



		
		@Test
		public void finding_all_links() throws IOException, FileNotFoundException {
			//try {
		        List<WebElement> websitelinks = driver.findElements(By.tagName("a"));
		        int linkcount = websitelinks.size(); 
		         System.out.println(websitelinks.size()); 
		          for (WebElement linklist : websitelinks){
		         String link = linklist.getText(); 
		         System.out.println(link);
		        //System.out.println(linklist);   
		         String thrivelinks= linklist.getAttribute("href");
		         System.out.println(thrivelinks);
		         /*if (link !=""){
		             myElement.click();
		             Thread.sleep(2000);
		             System.out.println("third");*/
		            //} //Finally Thread.sleep(5000);
		
	 //public void printing_to_Excel() throws IOException, FileNotFoundException{
		 //Setting up Excel.
		 //Specify Excel file path
		        	 
		       //Create an object of File class to open xlsx file
		         src = new File("C:\\Users\\lynn.bierl\\Selenium\\ThriveSiteTesting.xlsx");
		         //Create an object of FileInputStream class to read excel file
	              FIS = new FileInputStream(src);
		          wb= new XSSFWorkbook(FIS);

		       
		         
		         //Read excel sheet by sheet name   	    
		         XSSFSheet Sheet1 = wb.getSheet("LINKS");
		         	
		        		

		        	    //Get the current count of rows in excel file

		        	    //int rowCount = Sheet1.getFirstRowNum();

		        	    //Get the first row from the sheet

		        	    //Row row = Sheet1.getRow(0);

		        	    //Create a new row and append it at last of sheet

		        	    //Row newRow = Sheet1.createRow(0);

		        	    //Create a loop over the cell of newly created Row

		        	    for(int i = 0; i <= linkcount; i++){

		        	        //Fill data in row

		        	        //Cell cell = newRow.getCell(i);
		        	    	Row newRow = Sheet1.createRow(i);
		        	    	Cell cell = newRow.createCell(0);

		        	        //System.out.println("i = " + i);
		        	        //System.out.println("cell = " + cell);
		        	        
		        	        
		        	        
		        	        cell.setCellValue(thrivelinks);
		        	        
		        	        FOS = new FileOutputStream(src);

			        	    //write data in the excel file

			        	    wb.write(FOS);


		        	    }

		        	    //Close input stream

		        	    FIS.close();

		        	    //Create an object of FileOutputStream class to create write data in excel file

		        	    /*FOS = new FileOutputStream(src);*/

		        	    //write data in the excel file

		        	    //wb.write(FOS);

		        	    //close output stream

		        	    FOS.close();

		          }

		        	    
	              /*driver.navigate().to(url);
	              List<WebElement> websitelinks = driver.findElements(By.tagName("a"));
	              System.out.println("*********************** Printing URL's to Excel *********************");*/
	              
	 driver.quit(); 
	     }
	}


