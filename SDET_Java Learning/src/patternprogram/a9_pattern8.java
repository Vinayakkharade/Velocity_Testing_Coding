package patternprogram;

public class a9_pattern8 {
	public static void main(String[] args) {
	int num=3;
	int space=0;
	for(int i=1;i<=3;i++)
	{
		int count=3;
	for(int j=1;j<=space;j++)
	{
		System.out.print(" ");
	}
      for(int k=1;k<=num;k++)
      {
    	  System.out.print(count);
    	  count--;
      }
      System.out.println();
      num--;
      space++;
   
	}

}
}
