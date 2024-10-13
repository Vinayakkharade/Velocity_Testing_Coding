package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
//Remove duplicate word from string
public class A3 {
	public static void main(String[] args) {
		String s1="vihaan is good boy and he is perfect in drawing as well";
		String s2="";
		String []a=s1.split(" ");

		Map<String,Integer>lmap=new LinkedHashMap<>();

		for(String str1:a) {
			if(lmap.containsKey(str1)) {
				lmap.put(str1, lmap.get(str1)+1);
			}
			else{
				lmap.put(str1, 1);
			}
		}
		Set<Map.Entry<String,Integer>>smap=lmap.entrySet();

		for(Map.Entry<String,Integer>data:smap) {
			if(data.getValue()==1) {
				s2=s2+" "+data.getKey();
			}
		}
	String s3=s2.trim();
		System.out.println(s3);

	}
}

