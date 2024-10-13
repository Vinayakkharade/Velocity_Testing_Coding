package a8inheritance_wrt_variable2;

public class ChildClass11 extends ParentClass11  {
 int a=20;
 static int b=55;
 public void m1() {
	 int a=1000;
	 System.out.println(this.a);/// child class global variable
	 System.out.println(a);///child class local variable
	 System.out.println(b);/// child class  global variable
	 
	
	 System.out.println(super.a);              /// parent class global variable
	 System.out.println(ParentClass11.b);   /// parent class global variable
 }
    public static void main(String[] args) {
	 
    	ChildClass11 obj2=new ChildClass11();
    	obj2.m1();
    	
    	m2();
}
}// All the global variable of parent class is available to the child class by default.
 //parent class static variable name is same as child class static variable name...
// then to call parent class static variable inside the child class static method by class name.variable name
