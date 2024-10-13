package a8_Map_Program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A5_Max_no_occurance_of_char {
	public static void main(String[] args) {
		String s1="maaaabcddfkhusff";
		char[]a=s1.toCharArray();
         int maxvalue=0;
         char maxchar=' ';
		Map<Character,Integer>smap=new LinkedHashMap<>();

		for(char str1:a) 
			if(smap.containsKey(str1))
				smap.put(str1,smap.get(str1)+1);
			else
				smap.put(str1, 1);
		
		Set<Map.Entry<Character,Integer>>lmap=smap.entrySet();

		for(Map.Entry<Character,Integer>data:lmap) {

			if(data.getValue()>maxvalue) {
				maxvalue=data.getValue();
				maxchar=data.getKey();
			}
		}
		System.out.println(maxchar+":"+maxvalue);
	}
}

