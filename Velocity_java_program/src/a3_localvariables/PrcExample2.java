package a3_localvariables;
public class PrcExample2 {
int Maths;
int Physics;
int Chemistry;

void MARKS()
{
System.out.println("Maths marks="+Maths);
System.out.println("Physics marks="+Physics);
System.out.println("Chemistry marks="+Chemistry);
}
public static void main(String[]args)
{
	PrcExample2 obj1=new PrcExample2();
	System.out.println("Student name=VINAYAK");
	obj1.Maths=55;
	obj1.Physics=85;
	obj1.Chemistry=65;
	obj1.MARKS();
	System.out.println("   ");

	PrcExample2 obj2=new PrcExample2();
	System.out.println("Student name=VIHAAN");
	obj2.Maths=45;
	obj2.Physics=70;
	obj2.Chemistry=80;
	obj2.MARKS();
	System.out.println("   ");
	
	PrcExample2 obj3=new PrcExample2();
	System.out.println("Student name=BHUSHAN");
	obj3.Maths=55;
	obj3.Physics=67;
	obj3.Chemistry=90;
	obj3.MARKS();
}
}
