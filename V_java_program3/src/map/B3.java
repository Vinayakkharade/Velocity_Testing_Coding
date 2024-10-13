package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class B3 {
	
	public static void main(String[] args) {
		 String s1 = "aabbadd";
	        char[] a = s1.toCharArray();

	        Map<Character, Integer> smap = new LinkedHashMap<>();

	        for (char str1 : a) {
	            smap.put(str1, smap.getOrDefault(str1, 0) + 1);
	        }

	        StringBuilder compressed = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : smap.entrySet()) {
	            compressed.append(entry.getKey());
	            compressed.append(entry.getValue());
	        }
	        System.out.println(compressed);
	    }
    }


