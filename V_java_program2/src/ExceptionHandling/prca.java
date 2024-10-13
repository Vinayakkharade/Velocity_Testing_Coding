package ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

public class prca {
	/*
	 * public static boolean m1(int[]a) {
	 * 
	 * }
	 */
	

	public static void main(String[] args) {
		int[]a= {15, 24, 48, 21, 43, 11, 79, 93};
	
for(int i=0;i<a.length;i++) {
	for(int j=i;j<a.length;j++) {
		if(a[i]>a[j]) {
			a[i]=a[j];
			a[j]=a[i];
		}
	}
	
}
ArrayList al=new ArrayList();
al.add(a);
System.out.println(al.get(al.size()-1));
System.out.println(al.get(al.size()-2));

	}
}
