package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map2 {

	public static void main(String[] args) {
		Map<String,Integer>smap=new TreeMap<>();

		smap.put("vinayak",3);
		smap.put("soham",2);
		smap.put("vihaan",1);
		
	
		Set<Map.Entry<String,Integer>>lamp=smap.entrySet();

		for(Map.Entry<String,Integer>data:lamp) {
			System.out.print(data.getKey()+" ");

		}
		System.out.print(smap);

	}
}