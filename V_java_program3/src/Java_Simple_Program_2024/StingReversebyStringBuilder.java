package Java_Simple_Program_2024;

public class StingReversebyStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="vinayak";
		StringBuilder sb=new StringBuilder();
		
		String s2=sb.append(s1).reverse().toString();
		
		System.out.println(s2);
	
	}

}
