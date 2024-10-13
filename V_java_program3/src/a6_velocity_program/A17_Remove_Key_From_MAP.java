package a6_velocity_program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A17_Remove_Key_From_MAP {
	public static void main(String[] args) {
		
		Map<String,Integer>smap=new LinkedHashMap<>();
		smap.put("ABC1", 1);
		smap.put("ABC2", 2);
		smap.put("ABC3", 3);
		smap.put("ABC4", 4);
		smap.put("ABC5", 5);
		
		System.out.println(smap);
		
		smap.remove("ABC3");
		smap.put("vihaan", 12);
	
		//System.out.println(smap);
		Set<Map.Entry<String,Integer>>lamp=smap.entrySet();
		for(Map.Entry<String,Integer>data:lamp)
			//System.out.println(data.getKey());
		System.out.println(data);
		
	}

	}


