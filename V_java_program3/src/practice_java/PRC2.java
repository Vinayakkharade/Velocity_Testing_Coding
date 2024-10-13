package practice_java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PRC2 {
	public static void main(String[] args) {
		int empty=0;
		int[]a= {10,23,12,56,67};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					empty=a[i];
					a[i]=a[j];
					a[j]=empty;
				}
			}
			
		}

		System.out.println("second highest number:"+a[1]);
		System.out.println("second smallest number:"+a[(a.length)-2]);
		
			

	}
}


