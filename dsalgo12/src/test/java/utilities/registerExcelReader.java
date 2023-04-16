package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;


import driverFactory.DriverFactory;

public class registerExcelReader {
	
	private static WebDriver driver=DriverFactory.getdriver();
	
	public String getregisterusername(int rowno) throws Exception  {
		File file = new File("./src/test/resources/ExcelData/register_workbook1.xls");
	    FileInputStream fis = new FileInputStream(file);
	    HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet = workbook.getSheetAt(0);
			String cell0 = sheet.getRow(rowno).getCell(0).getStringCellValue();
			return cell0;
		
	}
	
	public String getregisterpassword(int rowno) throws Exception {
		File file = new File("./src/test/resources/ExcelData/register_workbook1.xls");
		FileInputStream fis = new FileInputStream(file);
	    HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet = workbook.getSheetAt(0);
			String cell1=sheet.getRow(rowno).getCell(1).getStringCellValue();
			return cell1;
		
		
	}
	
	public String getregisterconfirmpassword(int rowno) throws Exception {
		File file = new File("./src/test/resources/ExcelData/register_workbook1.xls");
		FileInputStream fis = new FileInputStream(file);
	    HSSFWorkbook workbook = new HSSFWorkbook(fis);
	    HSSFSheet sheet = workbook.getSheetAt(0);
		String cell2=sheet.getRow(rowno).getCell(2).getStringCellValue();
		return cell2;
		
	}

}
