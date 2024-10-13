package a9accessmodifierpublic1;

public class a {
	//swap two strings without third variable

	public static void main(String[]args){
	String a="vinayak";
	String b="vihaan";//6

	a=a+b;//vinayakvihaan==13//6

	b=a.substring(0,a.length()-b.length());//7

	a=a.substring(b.length(),a.length());
	System.out.println("a="+a);
	System.out.println("b="+b);

	}
}
