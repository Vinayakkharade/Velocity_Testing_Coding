package a1_javamethods;

public class NonStaticMethodIinsideNonStaticMethod {
 
	public void method1()
	{
	System.out.println("Method 1 non static method");
	}
	
	public void method2()
	{
		method1();
	System.out.println("Method 2 also non static method");
	}
	
	public static void main(String[]args)
	{
		NonStaticMethodIinsideNonStaticMethod obj=new NonStaticMethodIinsideNonStaticMethod();
		obj.method2();
	
	}
}
