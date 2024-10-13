package inheritance;

class A ///parent class
{
int a;
int b;
  void display()
  {
  System.out.println(a-b);
  }
}

class B extends A  // clild class
{
	int x;
	int y;
 void show()
 {
	 System.out.println(x+y);
 }
}

public class SingleInheritance {

	public static void main(String[] args) {
		
	//A obj=new A();
	//obj.a=100;
	//obj.b=20;
	//obj.display();
		
	B bobj=new B();
	bobj.x=20;
	bobj.y=30;
	bobj.show();
	
	
	bobj.a=150;
	bobj.b=50;
	bobj.display();
	
	}
	
	
}
