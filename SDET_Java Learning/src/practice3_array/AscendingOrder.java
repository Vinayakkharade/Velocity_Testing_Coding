package practice3_array;

public class AscendingOrder {

	public static void main(String[] args) {
		int[]ar= {88,13,55,65,90};
		int length=ar.length;
	int temp=0;
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
			if(ar[i]>ar[j]) {
				temp=ar[i];
			   ar[i]=ar[j];
			   ar[j]=temp;	
			}	
	   }
		}
	for(int k=0;k<length;k++)
	{
		System.out.print(ar[k]+" ");
	}
}
}