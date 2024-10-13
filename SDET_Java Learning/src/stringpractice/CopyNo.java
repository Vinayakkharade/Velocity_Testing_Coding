package stringpractice;

public class CopyNo {
	public static void main(String[] args) {
		   String s1="vinu";
		   char[]ar=s1.toCharArray();
		   int size=ar.length;
		  char[]nr=new char[size];
		  int i=0;
		while(i!=size)
		{
			nr[i]=ar[i];
					i++;
		}
		System.out.print(nr);
		   }
		   
}
