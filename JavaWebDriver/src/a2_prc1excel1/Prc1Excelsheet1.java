package a2_prc1excel1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Prc1Excelsheet1 {
public static void main(String[]args) throws IOException
{
  FileInputStream file=new FileInputStream("D:/Testing Study Material/selenium study/marks.xlsx");	
	XSSFWorkbook workbook=new XSSFWorkbook(file);///workbook present in file
	XSSFSheet sheet=workbook.getSheet("sheet1");
	int rowcount=sheet.getLastRowNum();
	
    int columncount=sheet.getRow(0).getLastCellNum();
    System.out.println(rowcount);
    System.out.println(columncount);
    
    for(int i=0;i<=rowcount;i++) 
    {
    	XSSFRow currentrow=sheet.getRow(i);
    	
    	for(int j=0;j<columncount;j++)
    	{
    		String value= currentrow.getCell(j).toString();
    		System.out.print(value+"    ");
    	}
    	System.out.println();
    }
    
}	

}
