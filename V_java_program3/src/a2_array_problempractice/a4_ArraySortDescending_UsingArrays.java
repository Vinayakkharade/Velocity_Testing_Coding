package a2_array_problempractice;

import java.util.Arrays;

public class a4_ArraySortDescending_UsingArrays {
public static void main(String[] args) {
	
	int[]ar={56,880,25,4570,76,46,770,10,354,60};
	
	Arrays.sort(ar);
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.print(ar[i]+" ");
	}

}
}
