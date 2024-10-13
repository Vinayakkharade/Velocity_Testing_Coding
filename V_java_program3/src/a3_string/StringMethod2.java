package a3_string;

public class StringMethod2 {
public static void main(String[] args) {
	String s1="  ";
	String s2="VINU kharade";
	
    boolean result=s1.isBlank();// check the string is blank or not /// it gives the result as true or false. 
    System.out.println(result);
    
    System.out.println(s2);
    String[]sp=s2.split("\\s");// split the string from specified location
    for(String s:sp)
    System.out.print("string split" +s);
    
    for(String m1:sp)
    System.out.println(m1);
    
    String s3="vsk12";
    char ch=s3.charAt(4);
    System.out.print(Character.isDigit(ch));// it check whether the given char is digit or not.(true or false)
    
    
    
    
}
}
