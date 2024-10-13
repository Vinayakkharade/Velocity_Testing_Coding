package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A7 {
	public static void main(String[] args) {
	int maxOcuurance=0;
	char maxOccuranceKey = ' ';
	String s1="vinayak";
	char[]a=s1.toCharArray();
	String s2="";
	Map<Character,Integer>lmap=new LinkedHashMap<>();
	for(char str1:a){
	if(lmap.containsKey(str1)){
		lmap.put(str1, lmap.get(str1)+1);
	}
	else{
		lmap.put(str1,1);
	}
	}

	Set<Map.Entry<Character,Integer>>smap=lmap.entrySet();
	//Remove the duplicate char from string---------------//--------------------
	for(Map.Entry<Character,Integer>data:smap){
	if(data.getValue()==1){
	s2=s2+data.getKey();
	}
	}
	System.out.println(s2.trim());
	
	//No of occurance of char in string----------------------//-------------------
	for(Map.Entry<Character,Integer>data1:smap){
	System.out.println(data1.getKey()+":"+data1.getValue());
	}

	//Max occurance of char in string---------------------//----------------
	for(Map.Entry<Character,Integer>data2:smap){
	if(data2.getValue()>maxOcuurance){
	maxOcuurance=data2.getValue();
	maxOccuranceKey=data2.getKey();
	}

	}
	System.out.println(maxOccuranceKey+":"+maxOcuurance);
}
}
