package practice3_array;

public class MinNo {
	public static void main(String[] args) {
	int[]ar= {54,34,90,56,12};
	int min=ar[0];
	int length=ar.length;
	
	for(int i=1;i<length;i++)
	{
		if(ar[i]<min)
			min=ar[i];
	}
	System.out.print(min);	
}
}