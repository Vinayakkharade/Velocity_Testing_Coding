package interface_1;

interface blk1
{
int a=130;
void display();// abstract method-(method have only defination & no implimentation)

}

interface blk2
{
	int b=100;
	void show(); // abstract method-(method have only defination & no implimentation)
}

public class MultipleInheritance implements blk1,blk2
{
public void display()  ///U have put public in front of method because in interface methods default.
{
	System.out.println(a);
}
	public void show()
	{
		System.out.println(b);
}
	public static void main(String[] args) {
		
MultipleInheritance mi=new MultipleInheritance();
   mi.display();
   mi.show();
}
}

//1)multiple inheritance achieved by interface.
//