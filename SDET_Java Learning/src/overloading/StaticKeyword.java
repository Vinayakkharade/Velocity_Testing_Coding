package overloading;

public class StaticKeyword {

	int a;  
	static int b;
	
	static void m1()// static method
	{
		System.out.println();
	}
	void m2()//// non static method
	{
		System.out.println("non static method"); 
	}
	
	public static void main(String[] args) {
		
		b=100;
		System.out.println("b="+b);
		m1();
		
		StaticKeyword sk=new StaticKeyword();
		sk.a=20;
		System.out.println("a+b="+(sk.a+b));
		sk.m2();
		
	}
	
}
