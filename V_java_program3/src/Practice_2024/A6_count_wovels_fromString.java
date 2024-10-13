package Practice_2024;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A6_count_wovels_fromString {
	
	public static void main(String[] args) {
		
		String s1="Kharade";
		s1=s1.toLowerCase();
		String s2="";
		String s3="";
		int count=0;
		
		char[]ar=s1.toCharArray();
		
		Map<Character, Integer> lmap=new LinkedHashMap<>();
		
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

			if(data.getValue()==1) {
				s2=s2+data.getKey();
				
			}

		}
		
		
		for(int i=0;i<s2.length();i++) {
			
			char wovel=s2.charAt(i);
			
			if(wovel=='a' || wovel=='e' || wovel=='i' || wovel=='o' || wovel=='u') {
				count++;
				System.out.println("wovels:"+wovel);
			
			}
			
			if(!(wovel=='a' || wovel=='e' || wovel=='i'|| wovel=='o' || wovel=='u')) {
			
				s3=s3+wovel;
			}
			
		}
		System.out.println("No of wovels:"+count);
		System.out.println("Wovel removed string:"+s3);
	}

}
