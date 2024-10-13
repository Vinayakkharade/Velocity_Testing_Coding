package L_Excel_Read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B_Exce_write {
	
public static void main(String[] args) throws IOException {
	// get the path of excel file
	File path=new File("D:\\VELOCITY\\STUDY MATERIAL\\AUTOMATION\\screenshot\\excel\\s.xlsx");
	
	// load the file usinf fileinputStream class
	FileInputStream	load=new FileInputStream(path);
	
	// aceess the workbook of excel file
	XSSFWorkbook workbook=new XSSFWorkbook(load);
	
	// get the sheet from workook
	XSSFSheet sheet=workbook.getSheetAt(0);
	
	// set the data in sheet
	FileOutputStream write1=new FileOutputStream(path);
	sheet.createRow(1).createCell(0).setCellValue("54");
	workbook.write(write1);
	
}
}
