package patternprogram;

public class a9_pattern91 {
	public static void main(String[] args) {
		int num=2;
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();	
	}
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=num;j++)
		{
			System.out.print(j);
		}
		System.out.println();	
		num--;
	}
}
}

