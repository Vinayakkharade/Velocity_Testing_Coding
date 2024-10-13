package a5_constructor;

public class Prc4ParametrizedConstructor {

	public Prc4ParametrizedConstructor(int a,int b)
	{
		this();
	System.out.println("a="+a +"  "+"b="+b);
	}
	
	public Prc4ParametrizedConstructor()
	{
	System.out.println("a & b are interger data type");
	}
public static void main(String[]args)
{
	Prc4ParametrizedConstructor co=new Prc4ParametrizedConstructor(50,0);

}	
	
}
// IF class contain multiple constructor, to call constructor from another constructor then we use "this" keyword.  