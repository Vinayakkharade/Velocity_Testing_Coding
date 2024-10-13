package a7_ProgramPractice;

import java.util.Arrays;

public class c_Remove_space_sort_String {
  
	public static void main(String[] args) {
		String s1="cd  a  g   h  b e";
		String s2=s1.replace(" ","");
		
		char[]a=s2.toCharArray();
		
		Arrays.sort(a);
		
	System.out.print(a);
		}

	
}
