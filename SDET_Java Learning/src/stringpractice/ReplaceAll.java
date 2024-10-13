package stringpractice;

public class ReplaceAll {
public static void main(String[] args) {
	String s1="vi@@84   ha*a*n";
	String letter=s1.replaceAll("[^a-zA-Z]","");
	//System.out.println(letter);
	
	String s2="  v i ha       a           n";
	String space=s2.replaceAll(" ","");
	//System.out.println(space);
	
	String spac1=s2.replaceAll("\\s","");
	System.out.println(spac1);
}
	
	
}
