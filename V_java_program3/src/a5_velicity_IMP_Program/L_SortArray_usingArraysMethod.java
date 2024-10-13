package a5_velicity_IMP_Program;

import java.util.Arrays;

public class L_SortArray_usingArraysMethod {
public static void main(String[] args) {
	int[]a= {12,90,67,78,555,903,8885,56,90,66,90};
	
	Arrays.sort(a);
	// sort the array ascending order
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	// sort the array Descending order
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
}
}

