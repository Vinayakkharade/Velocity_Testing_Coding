package a5_constructor;

public class Prc5StudentMarks {

	public Prc5StudentMarks(String name,int maths,int physics,int chemistry)
	{
    System.out.println("Name of student="+name);
	System.out.println("maths="+maths);
	System.out.println("physics="+physics);
	System.out.println("chemistry="+chemistry);
	System.out.println("----");
	}
	
public static void main(String[]args)
{
	Prc5StudentMarks obj1=new Prc5StudentMarks("vinayak",55,60,75);
	Prc5StudentMarks obj2=new Prc5StudentMarks("vihaan",50,80,65);
	Prc5StudentMarks obj3=new Prc5StudentMarks("soham",80,60,55);

}
}
