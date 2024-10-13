package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[]args) {
		
		int a=100;
		
		System.out.println(a/2);
		System.out.println(a/4);
		
		try {   // we write the risky code which may cause exception happen
		System.out.println(a/0);
		}
		catch(Exception d)// we write the code that tells us bypass situation on which exception get.
		{
			System.out.println("if risky code is find in try block then execute catch block");
		}
		finally {// no matter what finally block will get execute.It close the secure access which is given to the script at starting.
			System.out.println("close the database");
		}
		System.out.println(a/10);// mostly we are using the "try catch finally" for handling the unchecked exception.(run time exception)
	}
/// when we get the exception then try block open the database.
}
