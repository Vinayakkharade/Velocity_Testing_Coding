package Practice_2024;

public class A1_Reverse_String {
	
	public static void main(String[] args) {
		
		String s1="vinayak";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			
		}
		System.out.println("Reverse string:"+s2);
	}

}
