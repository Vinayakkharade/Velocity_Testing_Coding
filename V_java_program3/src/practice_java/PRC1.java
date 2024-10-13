package practice_java;

import java.util.ArrayList;
import java.util.TreeSet;

public class PRC1 {
	
public static void main(String[] args) {

	int[]a= {10,23,12,56,67};
	
	TreeSet<Integer> tr=new TreeSet<>();
	
	for(int num:a) {
		tr.add(num);
	}
	System.out.println(tr);
	ArrayList<Integer> al=new ArrayList<Integer>(tr);
	al.sort(null);
	for(int value:al) {
		System.out.print(value+" ");
	}
	System.out.println("");
	for(int i=al.size()-1;i>=0;i--) {
		System.out.print(al.get(i)+" ");
	}
	System.out.println("");
	System.out.println("second highest number:"+(al.get(al.size()-2)));
	System.out.println("second smallest number:"+(al.get(1)));
	
	
}
}
