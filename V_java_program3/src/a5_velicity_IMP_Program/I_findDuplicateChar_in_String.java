package a5_velicity_IMP_Program;

import java.util.HashMap;
import java.util.Set;


public class I_findDuplicateChar_in_String {
	
	public static void main(String[] args) {
		String s1="accchded";
		
		char[]a=s1.toCharArray();// convert the string in character array.
		
		HashMap<Character,Integer>smap=new HashMap<Character,Integer>();// hashmap class provides the keypair.

		for(char str1:a)// we are iterate each value in loop
			if(smap.containsKey(str1))// check character is present in smap
				smap.put(str1,smap.get(str1)+1);// if present in smap,then we putting the char & if duplicate is available increase the position by 1.
				else
					smap.put(str1, 1);  //(get gives position)
			
	     Set <Character>keys=smap.keySet();// set class eliminate the duplicate values(unique)
	     for(char ch:keys)
	    	 if(smap.get(ch)>1)
	    		 System.out.println(ch+":"+smap.get(ch));
	    
	}
}
