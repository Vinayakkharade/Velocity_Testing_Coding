package a3_string;

public class StringMethod1 {
public static void main(String[] args) {
	String s1="abcd";
	String s2="efg";
    String  s3="EFG";
    String s4="  vihaan  ";
	String join=s1.concat(s2);//concat-used to join the two strings.
		System.out.println(join);
		
		boolean compare=s1.equals(s2);//equals()-it is used to compare the two string content which is equal or not.(consider the case)
		System.out.println(compare);
		
		Boolean comp=s2.equalsIgnoreCase(s3);// equalsIgnoreCase(s3)- it compare the two string content which is equal or not ignoring case 
		System.out.println(comp);
		
		System.out.println(s1.charAt(2));//it returns the char value at particular index 
		
		System.out.println(s1.indexOf('c'));// it return the index value at particular char.
		
		System.out.println(s1.replace('b', 'd')); // it replaces the old char by new char.
		
		String trm=s4.trim();//it removes leading & trailing spaces from string.
		System.out.println(trm);
		
		System.out.println(s1.substring(2));// it create the another string from given string by mentioning is the index no.
		System.out.println(s1.substring(1, 4));//it create the another index from given string by mentioning the starting index & ending index-1;
		
		System.out.println(s1.length());// It gives the length or size of string
		
		System.out.println(s1.toUpperCase());// it convert the string into upper case
		
		System.out.println(s1.lastIndexOf('c'));
		
	
		System.out.println(s1.contains("cd"));// it searches the sequence of char value in given string// return true or false
}
}
