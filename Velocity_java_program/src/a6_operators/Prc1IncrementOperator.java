package a6_operators;

public class Prc1IncrementOperator {

	public static void main(String[]args)
	{
		int a=7;

		int b=a++;/// post increment
		
		System.out.println("post increment value of a="+a);
		System.out.println("post increment value of b="+b);
		
		int x=10;
		int y=++x;  // pre-increment
		System.out.println("pre increment value of x="+x);
		System.out.println("pre increment value of y="+y);
	}
}
// post increment---after assigning the value to the variable ,the value is incremented 
//pre increment---before assigning the value to variable, the value is incremented 

