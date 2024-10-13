package excel_utlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityClass {

	public void getrowcell(String path,int rownum,int cell) throws IOException {
		// load the file usinf fileinputStream class
		FileInputStream	load=new FileInputStream(path);
		
		// aceess the workbook of excel file
		XSSFWorkbook workbook=new XSSFWorkbook(load);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		String data=sheet.getRow(rownum).getCell(cell).getStringCellValue();
		
	}
	
}
			
		
	


