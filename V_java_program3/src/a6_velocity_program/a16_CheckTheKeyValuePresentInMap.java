package a6_velocity_program;

import java.util.LinkedHashMap;
import java.util.Map;

public class a16_CheckTheKeyValuePresentInMap {
	/// check the key & value present or not.
		public static void main(String[] args) {
			Map<String,Integer>smap=new LinkedHashMap<>();
			
			smap.put("abc1", 1);
			smap.put("abc2", 2);
			smap.put("abc3", 3);
			smap.put("abc4", 4);
			
			System.out.println(smap);
			
			System.out.println(smap.containsKey("abc"));// false
			System.out.println(smap.containsKey("abc3"));// true
			System.out.println(smap.containsValue(1));// true
			System.out.println(smap.containsValue(8));// false
}
}
