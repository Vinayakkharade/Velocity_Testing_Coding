package a4_argumentreturntype;

public class Prc6StudentMarks {

	public static void m1(int maths,int physics,int chemistry)
	{
		System.out.println("Marks of student");
		System.out.println("MATHS-"+maths);
		System.out.println("PHYSICS-"+physics);
		System.out.println("CHEMISTRY-"+chemistry);
		System.out.println("-----------");
	}
	
	public static void main(String[]args)
	{
	System.out.println("Name of student-Vinayak");
	   m1(65,75,55);
	 
	 System.out.println("Name of student-saurabh");
	   m1(60,77,85);
	   
	   System.out.println("Name of student-Vihaan");
	   m1(60,57,65);
	}
}



