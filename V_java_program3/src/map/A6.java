package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A6 {
	public static void main(String[] args) {
		int maxOcuurance=0;
		String maxOccuranceKey="";

		String s1="is are are is Vihaan kharade is";
		String[]a=s1.split(" ");
		String s2 = "";
		Map<String,Integer>lmap=new LinkedHashMap<>();
		for(String str1:a){
			if(lmap.containsKey(str1)){
				lmap.put(str1, lmap.get(str1)+1);
			}
			else{
				lmap.put(str1,1);
			}
		}

		Set<Map.Entry<String,Integer>>smap=lmap.entrySet();
		//Remove the duplicate word from string---------------//--------------------
		for(Map.Entry<String,Integer>data:smap){
			if(data.getValue()==1){
				s2=s2+" "+data.getKey();
			}
		}
		System.out.println(s2.trim());

		//No of occurance of word in string----------------------//-------------------
		for(Map.Entry<String,Integer>data1:smap){
			System.out.println(data1.getKey()+":"+data1.getValue());
		}

		//Max occurance of word in string---------------------//----------------
		for(Map.Entry<String,Integer>data2:smap){
			if(data2.getValue()>maxOcuurance){
				maxOcuurance=data2.getValue();
				maxOccuranceKey=data2.getKey();
			}
		}
		System.out.println(maxOccuranceKey+":"+maxOcuurance);

	}
}
