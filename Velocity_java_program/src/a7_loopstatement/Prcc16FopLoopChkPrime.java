package a7_loopstatement;

public class Prcc16FopLoopChkPrime {
public static void main(String[]args)
{
	int a=5;
	int count=0;
	for(int i=2;i<=a-1;i++)
	{
		if(a%i==0)
			count=count+1;
	}
	
	if(count>0)
		System.out.println("not prime no");
	else
		System.out.println("prime no");
	}
	
}	


