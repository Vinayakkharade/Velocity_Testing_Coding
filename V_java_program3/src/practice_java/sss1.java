package practice_java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class sss1 {

	public static void main(String[]args) {

		String s1="vin ay ak";
		
		int count=0;
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==' ') {
			count++;	
			}
		}
		
		System.out.println(count);

	}
}