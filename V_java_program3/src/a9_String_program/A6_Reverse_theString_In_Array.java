package a9_String_program;

public class A6_Reverse_theString_In_Array {
// reverse the string in the array & print the string in reverse manner
	
	public static String RevString(String s2) {
		String rev="";
		for(int j=s2.length()-1;j>=0;j--)
			rev=rev+s2.charAt(j);
		return rev;
	}
	
	
	public static void main(String[] args) {
		
		String s1="vinayak shripati kharade";
		String[]a=s1.split(" ");
		  
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			String s2=a[i];
			a[i]=RevString(s2);
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
