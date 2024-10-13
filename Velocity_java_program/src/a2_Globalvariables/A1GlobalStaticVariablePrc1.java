package a2_Globalvariables;

public class A1GlobalStaticVariablePrc1 {
  static int a=70;
 static int b;
  public static void m1()///// syntax of static method
  {
	  System.out.println("value of a="+a);
	  System.out.println("value of b="+b);
  }
  
  public void m2()/// syntax of non static method
  {
	  m1();
	  
  }
	 public static void main(String[]args)//// main method
	 {
		
	A1GlobalStaticVariablePrc1 obj=new A1GlobalStaticVariablePrc1();///object creation 
	obj.m2();     ///  calling by method name
	A1GlobalStaticVariablePrc1 obj1=new A1GlobalStaticVariablePrc1();
	obj.a=60;
	obj.m2();
	 }
}
///Types of variable: 1) global variable 2)local variable
//1) Global variable: 1) static variable 2) non static variable

//a)Static variable: 
//1)It is a class level Variable.
//2)It accessed throughout the class in any method without creation of object.
//3)We cannot define in method.
//4)If we are not assign the value to variable,then JVM assign the default value to that variable.
//5)Static variable value changes happen throughout the class.

//b)Non static variable:
//1)Defined at class level.
//2)Non static variable call inside static method we req object creation.
//3)non static variable call inside the non static method --we call directly.
//4)non static variable value changes from object to object.