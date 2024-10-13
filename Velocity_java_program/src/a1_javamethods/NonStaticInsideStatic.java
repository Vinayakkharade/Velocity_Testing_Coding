package a1_javamethods;

public class NonStaticInsideStatic {

	public void method1()
	{
    System.out.println("Method 1 is non static method");
	}
	
	public static void method2()
	{
		System.out.println("Method 2 is static method");
	}
	
	public static void main(String[]args)
	{
		NonStaticInsideStatic obj=new NonStaticInsideStatic();
		obj.method1();
	    method2();
	}
	
}
