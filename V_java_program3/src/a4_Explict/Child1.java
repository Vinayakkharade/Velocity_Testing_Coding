package a4_Explict;


public class Child1 extends Parent1{
	public void m2()
	{
		System.out.println("m2 child running");
	}
	public static void main(String[] args) {
		
		Parent1	parentref=new Parent1();
		
		 
		       Child1 ch=(Child1)parentref;
		   (ch).m1();
}
}//parent class not get the child class properties.
//whenever the parent class get type casted in child class then it is called as explict casting.
//In explict type casting parent class get type casted in child class
// where we are try to hold parent object by child ref which give the loss of information.
// due to which we runtime exception like classcast exception.