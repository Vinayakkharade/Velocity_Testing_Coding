package a1_methodoverriding;

public class ChildClass extends ParentClass{
	public void m1(int a)
	 {
		 System.out.println("Child Class");
	 }
	
	public static void main(String[] args) {
		
		ParentClass obj=new ParentClass();
		obj.m1(10);
		
		ParentClass obj1=new ChildClass();
		obj1.m1(20);
		ParentClass obj2=new ParentClass();
		obj2.m1(30);
	}
	
}
///Method overriding--- Method is called as overrided when name of method is same as well as argument is same in 
// parent class & child class.
// For method overriding inheritence is must.(ie means method overriding is not possible in same class.)
// In this jiske object hai uska method chalega in overriding.
// ie means whose object we are created that class method is running in method overriding.
//IMP NOTES:1)Overriding is called as run time polymorpism(late binding)
/// reason-On run time of program in method overriding we know that which method will get execute.
/// In overriding resolution based on run time object.