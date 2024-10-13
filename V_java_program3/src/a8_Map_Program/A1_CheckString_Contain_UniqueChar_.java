package a8_Map_Program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A1_CheckString_Contain_UniqueChar_ {
	public static void main(String[] args) {
		String s1="abc";
		char[]a=s1.toCharArray();
		int duplicate=0;

		Map<Character,Integer>smap=new LinkedHashMap<>();

		for(char str1:a)
			if(smap.containsKey(str1))
				smap.put(str1,smap.get(str1)+1);
			else
				smap.put(str1, 1);

		Set<Map.Entry<Character,Integer>>lmap=smap.entrySet();
		for(Map.Entry<Character,Integer>data:lmap) {

			if(data.getValue()>1) {
				System.out.println("given string not contain the unique char");
			System.exit(0);//terminates the program successfully
		}
		}
		System.out.println("given string contain the unique char");
	}		
}

