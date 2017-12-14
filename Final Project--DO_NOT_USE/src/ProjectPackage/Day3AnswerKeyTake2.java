package ProjectPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
* 
* @author Krishna Rungta
*         This script uses Excel to parameterize the Script
*/

public class Day3AnswerKeyTake2 {

   static WebDriver driver; // Selenium control driver
   static String baseURL;


   public static void setUp() {
	   String baseURL = ("http://demo.guru99.com/V4");
	   WebDriver driver;
	   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get(baseURL);
   }

   /**
    * SS1: Enter valid userid & password 
    *      Expected: Login successful home page shown 
    * SS2: Enter invalid userid & valid password 
    * SS3: Enter valid userid & invalid password 
    * SS4: Enter invalid userid & invalid password 
    *      Expected: A pop-up �User or Password is not valid� is shown
    * 
    * @throws Exception
    */
   public static void main(String[] args) throws Exception {
	// Read test data from excel file
   // Method 	getDataFromExcel is defined in class Util
   	String FILE_PATH = "C:\\Users\\lynn.bierl\\Input for final project.xls";
   	String SHEET_NAME = "Sheet1";
   	
	String TABLE_NAME = "LoginTable";
	   String[][] testData = util.getDataFromExcel(util.FILE_PATH,
   			util.SHEET_NAME, util.TABLE_NAME);
	String username, password;
	String actualTitle;
	String actualBoxtitle;

	//Testing for all parameters stored in the Excel File
	for (int i = 0; i < testData.length; i++) {
	    username = testData[i][0]; // get username
	    password = testData[i][1]; // get password
	    
	    // Enter username
	    driver.findElement(By.name("uid")).clear();
	    driver.findElement(By.name("uid")).sendKeys(username);

	    // Enter Password
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(password);

	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
      
       /* Determine Pass Fail Status of the Script
        * If login credentials are correct,  Alert(Pop up) is NOT present. An Exception is thrown and code in catch block is executed	
        * If login credentials are invalid, Alert is present. Code in try block is executed 	    
        */
	    try{ 
	    
	       	Alert alt = driver.switchTo().alert();
			actualBoxtitle = alt.getText(); // get content of the Alter Message
			alt.accept();
			if (actualBoxtitle.contains(util.EXPECT_ERROR)) { // Compare Error Text with Expected Error Value
			    System.out.println("Test case SS[" + i + "]: Passed"); 
			} else {
			    System.out.println("Test case SS[" + i + "]: Failed");
			}
		}    
	    catch (NoAlertPresentException Ex){ 
	    	actualTitle = driver.getTitle();
			// On Successful login compare Actual Page Title with Expected Title
			if (actualTitle.contains(util.EXPECT_TITLE)) {
			    System.out.println("Test case SS[" + i + "]: Passed");
			} else {
			    System.out.println("Test case SS[" + i + "]: Failed");
			}
			
       } 
	    driver.close();
	    } 
      
		
	    }
	

   }


	
	