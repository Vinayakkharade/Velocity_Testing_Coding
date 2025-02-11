package a5_velicity_IMP_Program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class K_FindDuplicateStringInArray {
	public static void main(String[]args){
		String[]a= {"vinayak","vihaan","soham","vinayak","soham","soham"};
		
		Map<String,Integer>smap=new LinkedHashMap<>();// it add the keypair in sequence of array.(in descending order)
		
		for(String str1:a)
		if(smap.containsKey(str1))// check the key is present then it add the key & value increase by 1.
			smap.put(str1, smap.get(str1)+1);
		else
			smap.put(str1, 1);// if key is not present then we add the key & value
		
	Set<Map.Entry<String,Integer>>lhmap=smap.entrySet();//using entryset we get setview.
	for(Map.Entry<String,Integer>data:lhmap)
	if(data.getValue()>1)
		System.out.println(data.getKey()+":"+data.getValue());
}
}