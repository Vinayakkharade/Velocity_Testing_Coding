package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		
		Map<Integer,String>smap=new LinkedHashMap<>();
		
		smap.put(3,"vinayak");
		smap.put(2, "soham");
		smap.put(1, "vihaan");
		
		
		Set<Map.Entry<Integer,String>>lamp=smap.entrySet();
		
		for(Map.Entry<Integer,String>data:lamp) {
			System.out.print(data.getKey()+" ");
		}
		for(Map.Entry<Integer,String>data:lamp) {
			System.out.print(data.getValue()+" ");
		}
		
		smap.replace(3, "sachin");
		System.out.println(smap);
	}

}
