package Practice_2024;

public class A5_Swap_2String {

	public static void main(String[] args) {
		String s1="vinu";
		String s2="kharade";

		s1=s1+s2;

		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length(), s1.length());
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
	}



}
