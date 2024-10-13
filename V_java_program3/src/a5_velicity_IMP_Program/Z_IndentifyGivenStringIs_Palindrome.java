package a5_velicity_IMP_Program;

public class Z_IndentifyGivenStringIs_Palindrome {
public static void main(String[] args) {
	String s1="WOW";
	String s2="";
	
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	if(s1.equals(s2))
		System.out.print(s1+" is palindrome string");
	else
		System.out.print(s1+" is not palindrome string");
	
}
}
