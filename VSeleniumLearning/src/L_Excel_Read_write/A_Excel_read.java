package L_Excel_Read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;



public class A_Excel_read {

	public static void main(String[] args) throws IOException {
		//get the path of excel file
		File path=new File("D:\\Testing Study Material\\VELOCITY\\STUDY MATERIAL\\AUTOMATION\\screenshot\\excel\\s.xlsx");

		// load the file
		FileInputStream	load=new FileInputStream(path);

		//Access workbook of excel
		XSSFWorkbook workbook =new XSSFWorkbook(load);

		//get the sheet
		XSSFSheet sheet=workbook.getSheetAt(0);

		//read the data 
		String read=sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(read);

	}

}
