import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringRemoveduplicate {
	
public static void main(String[]args) {
	
	String s1="abcaade";
	char[]arr=s1.toCharArray();
	Map<Character,Integer>smap= new LinkedHashMap<>();
	
	for(char str1:arr) {
		if(smap.containsKey(str1)) {
			smap.put(str1, smap.get(str1)+1);
			
		}
		else {
			smap.put(str1, 1);
		}
	}
		Set<Map.Entry<Character,Integer>>lmap=smap.entrySet();
		
		for(Map.Entry<Character,Integer>data:lmap) {
			if(data.getValue()>1) {
				System.out.println(data.getKey()+":"+data.getValue());
			
			}
		}
	
	
}
}
