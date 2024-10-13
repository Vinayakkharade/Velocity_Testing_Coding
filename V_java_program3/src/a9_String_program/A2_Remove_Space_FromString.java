package a9_String_program;

public class A2_Remove_Space_FromString {
public static void main(String[] args) {
	int count=0;
	String s1="vinayak shripati kharade";
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(ch==' ')
			count++;
	}
	System.out.println(count);
	String s2=s1.replace(" ", "");
	System.out.println(s2);
}
}
