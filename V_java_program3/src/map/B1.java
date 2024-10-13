package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import java.util.Set;

public class B1 {

	public static void main(String[] args) {

		int[]marks= {10,49,44,23};
		String[]stuName= {"vinayak","soham","vihaan","saurabh"};
		Map<String,Integer>smap=new LinkedHashMap<>();

		for(int i=0;i<marks.length;i++) {
			int mark1=marks[i];
			String sName=stuName[i];
			smap.put(sName, mark1);

		}
		Set<String>s=smap.keySet();
		Set<Map.Entry<String, Integer>>lamp=smap.entrySet();

		for(Map.Entry<String, Integer>data:lamp) {
			System.out.println(data.getKey()+":"+data.getValue());

		}
		/*
		 * for(String s1:s) { System.out.println(s1);
		 * 
		 * }
		 */

		List<String>ls=new ArrayList<>();
		for(String name:stuName) {
			ls.add(name);
		}
		Iterator<String> iter=ls.iterator();

		while(iter.hasNext()) {
			if(iter.next().equalsIgnoreCase("soham")) {
				iter.remove();
			}

		}
		for(int i=0;i<ls.size();i++) {
			System.out.println(	ls.get(i));
		}

	}

}
