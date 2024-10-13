package a8inheritance_wrt_variable3;

public class ChildClass2 extends ChildClass1{
 int a=300;
 
 public void m1()
 {
	 ParentClass obj=new ChildClass2();
	 
	 System.out.println(obj.a);
	 System.out.println(super.a);
	 System.out.println(a);
	 System.out.println(ParentClass.b);
 }
 public static void main(String[] args) {
	 ChildClass2 obj=new ChildClass2();
	 obj.m1();
	
}
 
}
// In multilevel inheritence if non static variable name is same in all classes then to call the  non-static variable of
//supermost class inside the non static method then we required object creation of supermost class.