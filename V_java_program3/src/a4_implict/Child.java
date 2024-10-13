package a4_implict;

public class Child extends Parent{
public void m2()
{
	System.out.println("m2 child running");
}
public static void main(String[] args) {
	
	Child childref=new Child();
	 childref.m1();
	 childref.m2();
	 
	       Parent parentref=(Parent)childref;
	   (parentref).m1();
	   
}//whenever the child object ref get type casted into parent class then child object have access only parent class method 
// so here we are resstricting the child object for parent class method only.
// this is called as implict casting
}
