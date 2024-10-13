package ExceptionHandling;

public class ThrowsException {

public static void main(String[] args) throws InterruptedException  
  {
	
	for(int i=1;i<=10;i++)
	{
		if(i<5) {
			System.out.println(i+"Less than 5");
			Thread.sleep(5000);
		}
		if(i>5)
		{
			System.out.println(i+"Greater than 5");
		}
	}
	
}
}
// Throws is used to handle the checked exception.(ie it handles only compile time exception.)
// throws keyword is written in front of main method along with exception name.
// Throwable is parent class of exception & errors.
// throw is used handle the user defined exception.