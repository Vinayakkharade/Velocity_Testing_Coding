package a5_constructor;

public class Prc6ConstructorInitilazation {
 int a;
int b;
int c;
 public Prc6ConstructorInitilazation(int p,int q ,int r)
 {
  this.a=p;
  this.b=q;
  this.c=r;
  System.out.println("value of a="+a);
  System.out.println("value of b="+b);
  System.out.println("value of c="+c);
 }
	public static void main(String[]args)
	{
		Prc6ConstructorInitilazation obj=new Prc6ConstructorInitilazation(50,45,80);
		System.out.println(obj.a);
	}
}
//constructor is used to initialize the data members(variables & methods)using this keyword.