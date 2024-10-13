package a1_methodhiding;

public class ChildClass1 extends ParentClass1{
	public static void m1(int a)
	 {
		 System.out.println("Child Class");
	 }
	
	public static void main(String[] args) {
		
		m1(10);
		
	}
	
}// static method  obj creation is not req. when we call directly then it will call the nearest method which is present 
/// in child class.
