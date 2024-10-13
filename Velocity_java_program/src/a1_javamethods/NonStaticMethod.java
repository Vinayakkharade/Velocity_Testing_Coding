package a1_javamethods;

public class NonStaticMethod {
	public void method1()
	{
	System.out.println("method 1 is non-static method");
	}
	
	public void method2()
	{
	System.out.println("method 2 is non-static method");	
	}
	
	public static void main(String[]args)
	{
		NonStaticMethod obj=new NonStaticMethod();
		obj.method1();
		obj.method2();
	
	}
	}

