package L_Excel_Read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class D_Excel_Write {

	public void write(int sheetNO,int rowNum,int cellNum,String setvalue) throws IOException {
		// get the path excel sheet
		File path =new File("D:\\VELOCITY\\STUDY MATERIAL\\AUTOMATION\\screenshot\\excel\\vk.xlsx");

		//load the file foe execution using FileInputStream class
		FileInputStream load=new FileInputStream(path);
		
		//access the workbook of excel file
		XSSFWorkbook workbook=new XSSFWorkbook(load);
		
		//using the object ref var access the method
		XSSFSheet sheet=workbook.getSheetAt(sheetNO);
		
		FileOutputStream write=new FileOutputStream(path);
		sheet.createRow(rowNum).createCell(cellNum).setCellValue(setvalue);
		workbook.write(write);
	}


	public static void main(String[] args) throws IOException {
		D_Excel_Write wr=new D_Excel_Write();
        wr.write(0,2,1,"sham");


	}
}
