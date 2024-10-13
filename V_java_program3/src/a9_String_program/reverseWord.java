package a9_String_program;

public class reverseWord {

	public static void main(String[]args) {
		String s1="hello world";
		String s2="";
		String[]ar=s1.split(" ");

		for(int i=ar.length-1;i>=0;i--) {
			s2=s2+" "+ar[i];
		}
		s2=s2.trim();
		System.out.println(s2);
	}
}