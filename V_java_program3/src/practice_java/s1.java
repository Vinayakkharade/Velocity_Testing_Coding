package practice_java;

public class s1 {

	public static void main(String[] args) {
		String s1="vinukharade";
		char ch=' ';
		String s2="";
		for(int i=0;i<s1.length();i++) {
			ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				s1=s1.replace(ch, ' ');

			}
		}
		s1=s1.replace(" ", "");
			System.out.println(s1);


		
	}

}
