package a1_javamethods;

public class StaticMethodInsideNonStaticMethod {

	public static void method1()
	{
	System.out.println("Method 1 static method");
	}
	
	public void method2()
	{
	method1();
	}
	
	public static void main(String[]args)
	{
		StaticMethodInsideNonStaticMethod obj= new StaticMethodInsideNonStaticMethod();
		obj.method2();
	
	}
}
