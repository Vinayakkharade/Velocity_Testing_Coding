package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
// remove duplicate char
public class A4 {
	public static void main(String[] args) {
		String s1="vinayak";
		char[]a=s1.toCharArray();
		String s2="";

		Map<Character,Integer>smap=new LinkedHashMap<>();

		for(char str1:a)
		
		
		smap.put(str1,1);

		Set<Map.Entry<Character,Integer>>lmap=smap.entrySet();

		for(Map.Entry<Character,Integer>data:lmap)

		if(data.getValue()==1)
		s2=s2+data.getKey();

		System.out.println(s2);
		
	}
}
