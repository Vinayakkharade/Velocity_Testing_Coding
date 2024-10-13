package a1_javamethods;

 public class StaticNonStaticMethod {
	 
 public static void method1()
{
	System.out.println("Method 1 is static method");
}
 
 public void method2()
 {
 	System.out.println("Method 2 is Non-static method");
 }
	
  public static void main(String[]args)
 {
	 method1();
	 
	 StaticNonStaticMethod obj=new StaticNonStaticMethod();
	 obj.method2();  
	 
 }
}
