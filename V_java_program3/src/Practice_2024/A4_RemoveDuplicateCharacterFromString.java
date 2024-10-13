package Practice_2024;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A4_RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {

		String s1="vinayak";
		String s2="";
		boolean hasDuplicate=false;

		char[]ar=s1.toCharArray();

		Map<Character,Integer>lmap=new LinkedHashMap<>();

		for(char str1:ar) {
			if(lmap.containsKey(str1)) {
				lmap.put(str1, lmap.get(str1)+0);
			}
			else {
				lmap.put(str1, 1);
			}

		}

		Set<Map.Entry<Character,Integer>> smap=lmap.entrySet();

		for(Map.Entry<Character,Integer>data:smap) {
			s2=s2+data.getKey();

			}
		
		System.out.println(s2);
		}
	

}
