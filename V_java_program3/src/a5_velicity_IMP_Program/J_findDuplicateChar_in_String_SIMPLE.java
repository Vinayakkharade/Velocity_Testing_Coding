package a5_velicity_IMP_Program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class J_findDuplicateChar_in_String_SIMPLE {
	public static void main(String[]args){
		String S1="abcaade";
		char[]a=S1.toCharArray();

   Map<Character,Integer>smap=new LinkedHashMap<>();
   
   for(char str1:a) {
	   if(smap.containsKey(str1)) {
		   smap.put(str1, smap.get(str1)+1);
	   }
		   else {
			  smap.put(str1, 1);
		   }
	}
   System.out.println(smap);
   Set<Map.Entry<Character,Integer>>lmap=smap.entrySet();
   for(Map.Entry<Character, Integer> data:lmap) {
	   if(data.getValue()>1)
		   System.out.println(data.getKey()+":"+data.getValue());
		// System.out.println(data);
   }
		}
}
