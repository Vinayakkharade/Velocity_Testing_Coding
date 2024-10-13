package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A3 {

	public static void main(String[] args) {
		String s1="I LOVE MYs INDIA MY COUNTRY IS INDIAn";
		String[]a=s1.split(" ");
		Map<String,Integer>smap=new LinkedHashMap<>();
		String s2="";
	for(String str1:a)
		if(smap.containsKey(str1))
			smap.put(str1, smap.get(str1)+1);
		else
			smap.put(str1, 1);
	
	Set<Map.Entry<String,Integer>>lmap=smap.entrySet();
	for(Map.Entry<String,Integer>data:lmap) 
		if(data.getValue()>1) {
			System.out.print("not conatain unique word");
		System.exit(0);
		}
		
	System.out.print(" conatain unique word");
	}
	
}
