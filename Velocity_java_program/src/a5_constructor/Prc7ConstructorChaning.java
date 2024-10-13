package a5_constructor;

public class Prc7ConstructorChaning {
 public Prc7ConstructorChaning(int a,int b,int c)
 {
	 this(10);
	System.out.println(a+b+c);
 }
	public Prc7ConstructorChaning(int d)
	{
   this();
   System.out.println("2nd constructor");
	}
	public Prc7ConstructorChaning()
	{
	 System.out.println("chaning constructor");
	}
	public static void main(String[]args)
	{
		Prc7ConstructorChaning obj=new Prc7ConstructorChaning(10,50,5);
	}
}

