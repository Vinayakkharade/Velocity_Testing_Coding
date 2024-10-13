package ExceptionHandling;

public class Throw {

	public void m1(int age) {
	if(age<18)
	{
		throw new IllegalArgumentException("Voting is not allowed");
	}
	else
	{
		System.out.println("Eligible for vote");
	}
	}
	public static void main(String[]args) {
		Throw obj=new Throw();
		obj.m1(15);
		System.out.println("enter the adhar no");
	}
}
