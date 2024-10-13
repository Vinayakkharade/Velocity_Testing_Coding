package practice;

public class prc3SwapNo {
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		System.out.println("Before swapping a="+a);
		System.out.println("Before swapping b="+b);
	
	a=a*b;//10x20=200 a=200
	b=a/b;//200/20=10  b=10
	a=a/b;//200/10  a=20
	
	System.out.println("after swapping a="+a);
	System.out.println("after swapping b="+b);
	
	}
}
/// here value of a & b should not be zero/// here sung the * & / operator