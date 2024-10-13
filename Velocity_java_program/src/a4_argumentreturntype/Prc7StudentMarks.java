package a4_argumentreturntype;

public class Prc7StudentMarks {

	public static char m1(int a,int b,int c)
	{
		System.out.println("Marks of student");
	System.out.println("maths="+a+" "+"physics="+b+" "+"chemistry="+c);
	System.out.println("------------");
	return 'a';
	}
	
	public static void main(String[]args)
	{
		System.out.println("Name of student=vinayak");
	     m1(77,70,55);
	     System.out.println("Name of student=soham");
	     m1(10,56,70);
	     System.out.println("Name of student=vihaan");
	    m1(60,36,90);
	     
	}
}
