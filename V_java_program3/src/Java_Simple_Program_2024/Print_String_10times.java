package Java_Simple_Program_2024;

public class Print_String_10times {
	
	public static void main(String[] args) {
		
		String name="vinayak";
		String s1="i";
		
		String s2=s1.replaceAll("i", "iiiii");
		
		String s3=s2.replaceAll("i", name+"\n");
		
		System.out.print(s3);
	}

}
