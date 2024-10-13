package hashmap_1;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample1 {
public static void main(String[]args)
{
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
			hm.put(1,"Mango");//(key=1 & value=Mango)
			hm.put(2,"grapes");
			System.out.println(hm);
			for(Map.Entry m:hm.entrySet())
			{
			System.out.println(m.getKey()+"="+m.getValue());
			}
			hm.remove(2);
			System.out.println(hm);
			for(Map.Entry m:hm.entrySet())
			{
			System.out.println(m.getKey()+"="+m.getValue());
			}
	
			}
}

//1)HashMap contain the keys & values.
//2)key & his value combined then it is called as keypair.
