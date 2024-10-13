package Java_Simple_Program_2024;

public class Ascending_Order_asper_pattern {

	public static void main(String[] args) {
		
		String s1="vinayak";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			s2=s1.substring(0, s1.length()-i);
			System.out.println(s2);
		}
		
		System.out.println("----------//---------------");
		String s3="";
		for(int i=s1.length()-1;i>=0;i--) {
			s3=s1.substring(0, s1.length()-i);
			System.out.println(s3);
		}
	}
		
}
