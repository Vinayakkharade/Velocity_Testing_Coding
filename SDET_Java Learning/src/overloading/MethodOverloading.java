package overloading;

public class MethodOverloading {

	int a;
	int b;
	void sum()// not takes parameter-1st 
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	void sum(int x,int y)// takes the parameter-2nd
	{
		a=x;
		b=y;
		System.out.println(x+y);
	}
	void sum(int x,int y,int z)// takes the parameter-3rd
    {
		System.out.println(x+y+z);
	}
	
	void sum(int x,double y)  //takes the parameter-4th
	{
		System.out.println(x+y);
	}
	
	public static void main(String[]args)
	{
		MethodOverloading mo= new MethodOverloading();
				mo.sum();
			   mo.sum(100,200);
			  mo.sum(50,40,100);
			  mo.sum(100, 20.5);
	}
	
}
