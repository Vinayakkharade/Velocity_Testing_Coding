package practice;

public class prc1SwapTwoNo {
public static void main(String[]args)
{
	int a=10;
	int b=20;
	System.out.println("Before swapping a="+a);
	System.out.println("Before swapping b="+b);
	
	int c=a;/// third variable foe swapping//c=10
	a=b;//b=20... a=20
	b=c;//b=10--
	System.out.println("after swapping a="+a);
	System.out.println("after swapping b="+b);
	
}
}
/// third variable for swapping 2 no