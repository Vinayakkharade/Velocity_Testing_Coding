package a7_loopstatement;

public class Prcc19FopLoopPttern6 {
public static void main(String[]args)
{
	for(int i=2;i<=8;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=8;k>=i;k--)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	
	
}
}
