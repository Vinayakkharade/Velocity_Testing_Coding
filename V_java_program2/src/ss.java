import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ss {

	public static void main(String[] args) {
		String s1="aabbccaa";

		char[]a=s1.toCharArray();

		Map<Character,Integer>smap=new LinkedHashMap<>();

		for(char str1:a){
		    if(smap.containsKey(str1)){
		        smap.put(str1,smap.get(str1)+1);
		    }
		    else{
		         smap.put(str1,1);
		    }
		}
		Set<Map.Entry<Character,Integer>>lmap=smap.entrySet();

		for(Map.Entry<Character,Integer>data:lmap){
		    System.out.print(data.getKey()+""+data.getValue());
		}




		    }
}
