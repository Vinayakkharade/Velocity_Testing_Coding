package inheritance;

class CC//PARRENT CLASS
{
int a;
int b;
 void display()
 {
System.out.println(a+b);
 }
}

class CE extends CC  ///PARENT CLASS OF CF
{
int x;
int y;
void show()
{
	System.out.println(x+y);
	
}

}

class CF extends CE///CHILD CLASS
{
 int p;
 int q;
 void add()
 {
	 System.out.println(p+q);
 }
 }

public class MultilevelInheritance {
	public static void main(String[] args) {
		
		CF cobj=new CF();  /// Created object for class CF
		cobj.a=20;
		cobj.b=55;
		cobj.x=100;
		cobj.y=200;
		cobj.p=1000;
		cobj.q=500;
		cobj.display();
		cobj.show();
		cobj.add();
	}

}
