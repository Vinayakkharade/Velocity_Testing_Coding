package a9_String_program;

// UNIQUE CHAR CHECK
public class A9 {
	public static String RevString(String s2){
		String rev="";
		for(int j=s2.length()-1;j>=0;j--)
		{
		rev=rev+s2.charAt(j);
		
		}
		return rev;
		}

		public static void main(String[]args){
		String[]a={"vinayak","sachin","saurabh"};

		for(int i=0;i<a.length;i++)
		{
		String s2=a[i];
		a[i]=RevString(s2);
		}
		for(int k=a.length-1;k>=0;k--)
		{
		System.out.println(a[k]);
		}

		}
	}

