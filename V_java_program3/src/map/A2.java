package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
// find the duplicate char from string
public class A2 {
	public static void main(String[] args) {
		String s1="vinayakkharade";
		char[]a=s1.toCharArray();

		Map<Character,Integer>smap=new LinkedHashMap<>();

		for(char str1:a)
		if(smap.containsKey(str1))
		smap.put(str1,smap.get(str1)+1);
		else
		smap.put(str1,1);
		System.out.println(smap);
		Set<Map.Entry<Character,Integer>>lmap=smap.entrySet();

		for(Map.Entry<Character,Integer>data:lmap)

		if(data.getValue()>1)
		System.out.println(data.getKey()+":"+data.getValue());
		
	}
}
