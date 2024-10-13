package hashmap_1;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample2 {

	public static void main(String[]args)
	{
	HashMap<Integer,String>hm=new HashMap<Integer,String>();/// hasmap creation
	  hm.put(1,"Two wheeler");
	  hm.put(2,"Three wheeler");
		System.out.println(hm);
		System.out.println("--------");
		for(Map.Entry m:hm.entrySet())
		{
		System.out.println(m.getKey()+ "."+m.getValue());
		}
		System.out.println("--------");
		hm.put(3,"Four wheeler");
		for(Map.Entry m:hm.entrySet())
		{
		System.out.println(m.getKey()+ "."+m.getValue());
		}
		
		
	}
}
