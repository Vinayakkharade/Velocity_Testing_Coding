package overloading;

public class ConstructorOverloading {

	int a;
	int b;
	double c;
	ConstructorOverloading()//1st constructor---not takes parameter
	{
		a=10;
		b=50;
	
	}
	
	ConstructorOverloading(int x,int y)//2nd constructor---takes parameter
	{
	   a=x;
	   b=y;
	}
	
	ConstructorOverloading(int x,double z) //3rd constructor---takes parameter
	{
		a=x;
		c=z;
	}
	 
	void display()
	{
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading();
       // ConstructorOverloading vo=new ConstructorOverloading(100,200);
		//ConstructorOverloading bo=new ConstructorOverloading(100,30.5);
		co.display();
		//vo.display();
		//bo.display();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
