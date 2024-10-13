package practice;

public class Prc6HighestnoFop {
	public static void main(String[]args)
	{
	int[]a= {150,80,56,777};
	int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			
			if(a[i]>max)	
			max=a[i];//45,80,
		}
		System.out.println("max no="+max);
	
	}
}
