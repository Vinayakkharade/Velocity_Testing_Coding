package a3_localvariables;

public class UseThisKeyword {
 int a=25;
 
void m1()
{
	int a=100;
	System.out.println(a);
	System.out.println(this.a);
	
	
}
public static void main(String[]args)
{
	UseThisKeyword obj=new UseThisKeyword();
    obj.m1();
    
}
}

///1)To Call non static variable inside Non static method---- this keyword used
///2) this.variable name