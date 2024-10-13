package JavaPractice_Module;

public class A2 {
	public static void main(String[] args) {
		
		String s1="welcome to java";
		char[]a=s1.toCharArray();
		String s2="";
		for(int i=a.length-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}

}
