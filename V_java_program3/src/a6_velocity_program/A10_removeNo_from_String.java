package a6_velocity_program;
// remove no from string
public class A10_removeNo_from_String {
	public static void main(String[] args) {
		String s1 = "d5de5dd56d5dd";
		
		String s2=s1.replaceAll("[0-9]", "");
		
		System.out.print(s2);
	}
}
