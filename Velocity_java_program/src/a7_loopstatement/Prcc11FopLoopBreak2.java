package a7_loopstatement;

public class Prcc11FopLoopBreak2 {
	public static void main(String[]args)
	{
     OuterLoop:for(int i=1;i<=5;i++)
   {
	for(int j=1;j<=5;j++) {
		System.out.println("vihaan  ");
		if(j==3)
		break  OuterLoop;
		
   }
	System.out.println("");
   } 
   
	}
}
