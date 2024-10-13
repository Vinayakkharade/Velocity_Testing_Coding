package practice;

public class prc2SwapNo {
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		System.out.println("Before swapping a="+a);
		System.out.println("Before swapping b="+b);
		
	  a=a+b;///a=30
	  b=a-b;///30-20== b=10
	  a=a-b;// 30-10=== a=20
	  System.out.println("after swapping a="+a);
		System.out.println("after swapping b="+b);
	}	
		
}
/// without third variable---use + & -
// 