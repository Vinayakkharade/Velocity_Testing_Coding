package a2_array_problempractice;

public class a2_ArraysortAscending {

	static int empty;
	public static void main(String[] args) {
		int[]ar= {56,880,25,4570,76,46,770,10,354,60};
		System.out.println("Array after sorting in ascending order");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
			if(ar[i]>ar[j])	///ascending from right(>right)
			{
				empty=ar[i];
				ar[i]=ar[j];
				ar[j]=empty;
			}
			}	
		}

		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
