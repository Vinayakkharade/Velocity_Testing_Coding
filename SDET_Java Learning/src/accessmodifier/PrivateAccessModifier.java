package accessmodifier;

class A
{
private int a;  ///private access modifier can be accessed only within the class
private void display()
{
	System.out.println(a);
}
}

public class PrivateAccessModifier {

	public static void main(String[] args) {
		
	A aobj=new A();
	aobj.a=50;       ///outside of class not possible
    aobj.display(); ///  outside of class not possible
	
	}	
}
///default can accessed within the package(if the are 2 or more class within package it can be accesed)