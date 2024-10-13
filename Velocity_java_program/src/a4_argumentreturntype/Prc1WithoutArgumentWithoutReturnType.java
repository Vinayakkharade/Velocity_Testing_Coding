package a4_argumentreturntype;

public class Prc1WithoutArgumentWithoutReturnType {

	public static void m1() ///static method-without argument & without return type
	{
	System.out.println("m1 is static-without argument & without return type");/// logic
	
	}
	
	public void m2()//// non static method -without argument & without return type
	{  
		System.out.println("m2 is non static-without argument & without return type");
	}
	public static void main(String[]args)
	{
	m1();
	
	Prc1WithoutArgumentWithoutReturnType obj=new Prc1WithoutArgumentWithoutReturnType();
	obj.m2();
	
	}
}

///void is return type which return nothing.
///Returning value from a method----- In java we declared the method with return type.  
///whatever writing inside round bracket of method----called argument
//