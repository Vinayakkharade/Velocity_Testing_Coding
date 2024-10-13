package a1_javamethods;


public class StaticMethod {      //main class
	public static void method1()  //static method 1
	{
	  System.out.println("method 1 is static method");   //syntax
    }
	public static void method2()  //static method 2
	{
	System.out.println("method 2 is static method");    //syntax
	}
	
	public static void main(String[]args)   ///main method
	{
		method1();  ///method 1 called directly
		method2(); ///method 2 called directly
		
	}
}

/// main method-1)main method is always static method
  //            2)JVM execute the 1st main method line by line


///static method -1)static method is class level method which is accessed directly(object creation is not req.)
   ///            2)calling method-method name();
///               3)memory of static method is fixed(so we not req object creation.)
//                4)memory is allocation once.

///non static method-1)non static method is accessed by creating object.
///                  2)object creation =   class name obj= new class name();
///                  3)calling method  - obj.method name();
///                  4)memory of static method is not fixed(so we req object creation)
///                  5)memory allocation is done when we call the non static method.
///                  6)memory de-allocation is done after execution of method 