package collection;

import java.util.regex.Pattern;

public class prc1 {

	public static void main(String[] args) {
		String filePath="C:\\Export\\POStatecsSummaryReport-90889.csv";
		String separator="\\";
		
		String[]fileName=null;
		fileName=filePath.replaceAll(Pattern.quote(separator), "\\\\").split("\\\\");
		String sheetname1=fileName[2];
		System.out.println(sheetname1);
		
		String SheetName=sheetname1.replaceAll(".csv", "");
		System.out.println(SheetName);
		

	}

}
