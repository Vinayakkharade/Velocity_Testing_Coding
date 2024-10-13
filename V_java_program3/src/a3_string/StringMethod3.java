package a3_string;

public class StringMethod3 {
public static void main(String[] args) {
	String s1="vinu";

	char[]ar=s1.toCharArray();// it convert the string into character array
	
	System.out.println(s1);
	System.out.println(s1.length());
	
	for(char a:ar)
	System.out.println(a);
}
}
