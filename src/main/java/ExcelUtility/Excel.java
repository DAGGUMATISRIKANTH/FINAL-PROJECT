

	package ExcelUtility;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



	public class Excel {
		public  String excel_username(int a) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\SRIKANTH\\eclipse-workspace\\DEMOBLAZE-R\\src\\test\\resources\\Testdata\\ExcelInputs.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);//Reading workbook form file
			  XSSFSheet sheet=workbook.getSheet("Sheet1");//reading sheet from workbook
				  String un=sheet.getRow(a).getCell(0).getStringCellValue();//Reading username from sheet1
				  
	          
			return un;
	}
		public  String excel_password(int b) throws IOException {
			  
			  FileInputStream fil = new FileInputStream(new File("C:\\Users\\SRIKANTH\\eclipse-workspace\\DEMOBLAZE-R\\src\\\\test\\resources\\Testdata\\ExcelInputs.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(fil);//Reading workbook form file
			  XSSFSheet sheet=workbook.getSheet("Sheet1");//reading sheet from workbook
			  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();//reading password from sheet1
			  
	return pwd;
	}

	}




