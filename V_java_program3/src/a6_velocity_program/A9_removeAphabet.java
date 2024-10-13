package a6_velocity_program;
// remove alphabet from string
public class A9_removeAphabet {
public static void main(String[] args) {
	String s1 = "d5de5dd56d5dd";
	
	String s2=s1.replaceAll("[A-Za-z]", "");
	
	System.out.print(s2);
}
}
