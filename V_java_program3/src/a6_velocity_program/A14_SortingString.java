package a6_velocity_program;
 /// Sorting of string//
import java.util.Arrays;

public class A14_SortingString {
public static void main(String[] args) {
	String s1="acefbd";
	
	char[] a=s1.toCharArray();
	Arrays.sort(a);
	
	for(int i=0;i<s1.length();i++)
	{
		System.out.print(a[i]);
	}
}
	
}

