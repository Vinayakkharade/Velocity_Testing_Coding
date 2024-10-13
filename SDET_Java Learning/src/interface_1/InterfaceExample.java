package interface_1;

interface Test
{
	int a=200;
	void display();
}

public class InterfaceExample implements Test
{
	public void display()
	{
    System.out.println(a);
	}
	public static void main(String[] args) {
		
	
	InterfaceExample ie=new InterfaceExample();
      ie.display();
	}
	}


/// interface blue print of class
// Interface contain static & final keyword(default)
// In interface default method is public
//method could not be instantiate.
//method is abstract method()