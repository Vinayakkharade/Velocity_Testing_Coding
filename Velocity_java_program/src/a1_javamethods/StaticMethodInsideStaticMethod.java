package a1_javamethods;

public class StaticMethodInsideStaticMethod {

	public static void method1()
	{
	System.out.println("method 1 is static method");
	}
	
	public static void method2()
	{
     method1();
	System.out.println("method 2 is also static method");

	}
	
	public static void main(String[]args)
	{
	method2();
	
	}
}
