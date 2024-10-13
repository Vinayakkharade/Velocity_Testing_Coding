package L_Excel_Read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_Excel_read_utilty {
	
	public void read(int sheetNO,int rowNum,int cellNo) throws IOException {
			//get the path of excel file
			File path=new File("D:\\VELOCITY\\STUDY MATERIAL\\AUTOMATION\\screenshot\\excel\\s.xlsx");

			// load the file
			FileInputStream	load=new FileInputStream(path);

			//Access workbook of excel
			XSSFWorkbook workbook =new XSSFWorkbook(load);

			//get the sheet
			XSSFSheet sheet=workbook.getSheetAt(sheetNO);

			//read the data 
			String read=sheet.getRow(rowNum).getCell(cellNo).getStringCellValue();
			
			System.out.println(read);

	}
	
public static void main(String[] args) throws IOException {
	
	C_Excel_read_utilty readData=new C_Excel_read_utilty();
	readData.read(0,0,1);
	
}
}
