package map;

import java.util.Arrays;

public class A8 {
	public static void main(String[] args) {

		//Remove spaces from string  & sorting
		String s1="b  c d a";
		s1=s1.replace(" ","");
		char[]a=s1.toCharArray();

		Arrays.sort(a);

		String s2=Arrays.toString(a);
		s2=s2.replaceAll("[^A-Za-z]", "");
		System.out.println(s2);
	}
}
