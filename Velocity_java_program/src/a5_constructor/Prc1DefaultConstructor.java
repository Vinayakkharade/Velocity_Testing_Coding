package a5_constructor;

public class Prc1DefaultConstructor {
	public Prc1DefaultConstructor()
	{
	System.out.println("default constructor");
     int a=100;
	System.out.println(a);
	}

	
	public static void main(String[]args)
	{
		Prc1DefaultConstructor obj=new Prc1DefaultConstructor();
               
	}
}
//CONSTRUCTOR:-It is a specialize method which execute at the time of object creation.
/// Rules:-1)Constructor name should be same class name.
//         2)Constructor have no return type.
//         3)constructor allows arguments.
//         4)In constructor we can call another constructor using "this" keyword.
//         5)no of constructor can be present in same class with different argument.
//-           (constructor chaining is possible using "this"keyword.)
// Use:-1)used to inatialize the data members (ie.variables & methods)
//      2)used execute the logic while creation of object.
// Types of constructor:
//1) default constructor:-No argument or no parameter
//2) parameterized constructor:- with argument or with parameter
///***1)if there is user defined constructor present in class then compiler decleares the paramterless constructor.(default constructor)
///***2)if default constructor have parameter then it gives default values of parameter.
//public,default,private,protected -- these access moddifer applicable to constructor.


///