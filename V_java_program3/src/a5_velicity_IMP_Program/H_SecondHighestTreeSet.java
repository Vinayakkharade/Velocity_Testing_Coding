package a5_velicity_IMP_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class H_SecondHighestTreeSet {
	public static void main(String[] args) {

		int[]a={56,880,12,4570,76,880,12,990,990};

		TreeSet tr=new TreeSet();//(object is created) arrange the array systematic way & add the each no

		for(int num:a)

			tr.add(num);/// num added in treeset 
		
		System.out.println(tr);
		

		ArrayList al=new ArrayList(tr);// arrange the array ascending order(allows the duplicate)

		System.out.println("2nd largest number in Array: " + al.get(al.size()-2));
		System.out.println("2nd samllest number in Array: " + al.get(1));
		System.out.println(al);

	}//(treeSet-class in collection framework)
}// get()-- it is method of arraylist which give value at particular index.
