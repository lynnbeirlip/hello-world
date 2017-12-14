import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_File {

	String FilePath = "C://Users//lynn.bierl//workspace//Session12c//src//testData//test.xlsx";
	String SheetName = "Sheet1";
	
	public static Object[][] getTableArray(FilePath SheetName) throws Exception {    
		   String[][] tabArray = null;
		   //String FilePath = "C://Users//lynn.bierl//workspace//Session12c//src//testData//test.xlsx";
		   //String SheetName = "Sheet1";
			
		   try {
 
			   FileInputStream ExcelFile = new FileInputStream(FilePath);
 
			   // Access the required test data sheet
 
			   ExcelWBook = new XSSFWorkbook(ExcelFile);
 
			   ExcelWSheet = ExcelWBook.getSheet(SheetName);
 
			   int startRow = 1;
 
			   int startCol = 1;
 
			   int ci,cj;
 
			   int totalRows = ExcelWSheet.getLastRowNum();
 
			   // you can write a function as well to get Column count
 
			   int totalCols = 2;
 
			   tabArray=new String[totalRows][totalCols];
 
			   ci=0;
 
			   for (int i=startRow;i<=totalRows;i++, ci++) {           	   
 
				  cj=0;
 
				   for (int j=startCol;j<=totalCols;j++, cj++){
 
					   tabArray[ci][cj]=getCellData(i,j);
 
					   System.out.println(tabArray[ci][cj]);  
 
						}
 
					}
 
				}
 
			catch (FileNotFoundException e){
 
				System.out.println("Could not read the Excel sheet");
 
				e.printStackTrace();
 
				}
 
			catch (IOException e){
 
				System.out.println("Could not read the Excel sheet");
 
				e.printStackTrace();
 
				}
 
			return(tabArray);
 
			}
 
		public static String getCellData(int RowNum, int ColNum) throws Exception {
 
			try{
 
				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
 
				int dataType = Cell.getCellType();
 
				if  (dataType == 3) {
 
					return "";
 
				}else{
 
					String CellData = Cell.getStringCellValue();
 
					return CellData;
 
				}catch (Exception e){
 
				System.out.println(e.getMessage());
 
				throw (e);
 
				}
 
			}
 
	}