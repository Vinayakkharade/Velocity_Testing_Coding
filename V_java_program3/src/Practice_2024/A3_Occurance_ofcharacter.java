package Practice_2024;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A3_Occurance_ofcharacter {

	public static void main(String[] args) {

		String s1="vinayak";
		boolean hasDuplicate=false;

		char[]ar=s1.toCharArray();

		Map<Character,Integer>lmap=new LinkedHashMap<>();

		for(char str1:ar) {
			if(lmap.containsKey(str1)) {
				lmap.put(str1, lmap.get(str1)+1);
			}
			else {
				lmap.put(str1, 1);
			}

		}

		Set<Map.Entry<Character,Integer>> smap=lmap.entrySet();

		for(Map.Entry<Character,Integer>data:smap) {

			System.out.println(data.getKey()+":"+data.getValue());

		}

		System.out.println("---------------//---------------------");
		//Find Duplicate character 
		for(Map.Entry<Character,Integer>data1:smap) {

			if(data1.getValue()>1) {
				System.out.println(data1.getKey()+":"+data1.getValue());
				hasDuplicate= true;
			}

		}
		if(!hasDuplicate) {
			System.out.println("No duplicate character");
		}

	}

}
