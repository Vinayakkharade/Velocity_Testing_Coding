package a8_Map_Program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A3_Remove_the_duplicate_char_from_string {
	public static void main(String[] args) {
		String s1="maabcddfkhusff";
		char[]a=s1.toCharArray();
		int duplicate=0;
		String s2="";

		Map<Character,Integer>smap=new LinkedHashMap<>();

		for(char str1:a) {
			if(smap.containsKey(str1))
				smap.put(str1,smap.get(str1)+0);
			else
				smap.put(str1,1 );
		}
		System.out.println(smap);
		Set<Map.Entry<Character,Integer>>lmap=smap.entrySet();
		System.out.println(lmap);
		for(Map.Entry<Character,Integer>data:lmap) {
			
			if(data.getValue()==1) {
				//System.out.println(data.getKey()+":"+data.getValue());
				//duplicate=data.getValue();
				s2=s2+data.getKey();
			}
	}
		System.out.println(s2);
}
}