package stringpractice;

public class Length {
public static void main(String[] args) {
	
	String s1="vinu kharade";
	int ln=s1.length()-1;
	for(int i=s1.length()-1;i>=0;i--)
	{
		System.out.print(s1.charAt(i));//reverse the string
	}
	System.out.println();
	System.out.println(s1.charAt(0));// 1st char
	System.out.println(s1.charAt(ln));// last char
	
	for(int i=0;i<s1.length();i++)
	{
		if(i%2!=0)
			System.out.println(s1.charAt(i)+"  ");	
	}
	System.out.println(s1.length());
}
	
}
