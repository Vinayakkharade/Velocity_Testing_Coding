package practice3_array;

public class MaxNo {
public static void main(String[] args) {
	int[]ar= {54,34,90,56,12};
	int max=ar[0];
	int length=ar.length;
	
	for(int i=1;i<length;i++)
	{
		if(ar[i]>max)
			max=ar[i];
	}
	System.out.print(max);	
}
}
