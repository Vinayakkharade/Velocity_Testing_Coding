package inheritance;

	class bank  ///
	{
		void interest()
		{
		System.out.println("rate of interest="+0);
		}
	}

	class SBI extends bank ////
	{
		void interest()
		{
		System.out.println("SBI rate of interest="+10);
		}
	}

	class AXIS extends bank ////
	{
		void interest()
		{
		System.out.println("AXIS rate of interest="+8);
		}
	}

	class HDFC extends bank  ////
	{
		void interest()
		{
		System.out.println("HDFC rate of interest="+5);
		}
	}
	
     public class OverRiding {
	public static void main(String[] args) {
		
		HDFC Hobj= new HDFC();
		Hobj.interest();
		
	   SBI Sobj= new SBI();
	   Sobj.interest();
	   
	AXIS Aobj= new AXIS();
	   Aobj.interest();
	   
	   
	}

}
