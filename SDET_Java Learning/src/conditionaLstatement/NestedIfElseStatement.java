package conditionaLstatement;

public class NestedIfElseStatement {

	public static void main(String[]args)
	{
	int percentage=60;
	
	{
	if(percentage<35)
      System.out.println("Fail");
	
      else if((percentage>=35)&&(percentage<=60))
      System.out.println("Pass");
	
      else if((percentage>60)&&(percentage<=75))
    	  System.out.println("grade A");
	
      else 
    	  System.out.println("grade A+");
	}
	}	
}
