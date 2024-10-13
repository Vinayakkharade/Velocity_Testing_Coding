package a6_velocity_program;

import java.util.Arrays;
// check the strings a anagrams
public class A15_ChecktheStringisAnagramornot {

	public static void main(String[] args) {

		String s1="car";
		String s2="rca";
	
			char[]a=s1.toCharArray();
			char[]b=s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(Arrays.equals(a,b));
		
		if(Arrays.equals(a,b))
			System.out.println("Given String anagrams");
		else
			System.out.println("Given String not anagrams");
			
		}
	} 




