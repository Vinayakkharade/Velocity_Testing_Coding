package a9_String_program;

public class A4_Convert_String_in_lower_case {

	public static void main(String[] args) {
		// convert in lower case
		String s1="Vinayak";
		s1=s1.toLowerCase();
		System.out.println(s1);
		
		//convert in upper case
		String s2="vinayak";
		s2=s1.toUpperCase();
		System.out.println(s2);
		
		//convert the 1st char in upper case
		String s3="vinayak";
		String s4="";
		s4=s4+s3.charAt(0);
		s4=s4.toUpperCase();
		for(int i=1;i<s3.length();i++)
		{
			s4=s4+s3.charAt(i);
		}
		System.out.println(s4);
		
	}

}
