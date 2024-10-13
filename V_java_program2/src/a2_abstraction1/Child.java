package a2_abstraction1;

public class Child extends Parent {

	public void m1(int a)
	{
		System.out.println("m1 is child class method which is implemented");
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 is parent class method which is not implemented");
		
	}
	public static void main(String[]args)
	{
		Child obj=new Child();
		obj.m1(10);
		obj.m1();
		obj.m2();
		obj.m3();	
	}
}// Abstraction:- It is a process of hiding the implementation details & shows only the functionality to the user.
/// ie. means it shows the only essential things & hide the internal details.
///ex.As i want to send the SMS ,then we type the text & send it other person.We dont know the internal details about the 
// SMS delivery.
///Abstraction let user to focus on usability of application not on the implimentation.
///
//what are way to achieve the abstraction:
//1)abstract(0 to 100% abstract method)
//2)interface(100% abstract method)

//1)Abstract:-It is a access modifier which is applicable to the class as well as methods.
//  If we dont know the complete implimentation of any method currently.
//it means only know the part of project & functionality & not sure about the implimenation of an method.
/// then we declare the method as a abstract.


