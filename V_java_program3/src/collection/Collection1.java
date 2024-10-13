package collection;

import java.util.LinkedList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		
		List<Integer>ls=new LinkedList<>();
		
		ls.add(1);
		ls.add(5);
		ls.add(3);
		
	
		System.out.println(ls);
		System.out.println(ls.contains(1));
		ls.remove(0);
		System.out.println(ls);
		int a=ls.size();
		
		System.out.println(a);
		ls.clear();
		System.out.println(ls);
	}

}
