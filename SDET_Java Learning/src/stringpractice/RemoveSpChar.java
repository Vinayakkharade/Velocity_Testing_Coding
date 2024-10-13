package stringpractice;

public class RemoveSpChar {
public static void main(String[] args) {
	
   String s1="Vi&&@haa123n";
	
   System.out.println(s1.replaceAll("[^a-zA-Z]",""));
   String s2="HELLO";
   System.out.println(s2.replaceAll("L","B"));
   
   
   String s3="HELLO is is why this";
   System.out.println(s3.replaceAll("is","was"));
   
   String s4="HisLO is is why this";
   System.out.println(s4.replace("is","was"));// replace all the occurances of char with given char
}
	
	
	
}
