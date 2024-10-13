package a9_String_program;
// swap two strings without any variable
public class A7_swap_twostringswithoutanyvariable {
public static void main(String[] args) {
	String a="vinu";
	String b="kharade";
	
	a=a+b;
	
   b=a.substring(0, a.length()-b.length());
   a=a.substring(b.length(), a.length());
   
   System.out.println("b="+b);
   System.out.println("a="+a);
	
}
	
}