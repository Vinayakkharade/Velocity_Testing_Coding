package practice_java;

public class p1 {
	
	public static void main(String[] args) {
		
		String s1="vinayak";
		String s2="vinayak";
		String s3=new String("vinayak");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		
	}

}
