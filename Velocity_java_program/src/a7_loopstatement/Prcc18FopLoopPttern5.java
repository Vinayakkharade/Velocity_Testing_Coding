package a7_loopstatement;

public class Prcc18FopLoopPttern5 {
public static void main(String[]args)
{
	for(int i=0;i<=7;i++)
	{
		for(int j=2*(7-i);j>=0;j--)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print(" *  ");
		}
		System.out.println();
	}
	
	
}
}
