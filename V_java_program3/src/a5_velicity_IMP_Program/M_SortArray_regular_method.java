package a5_velicity_IMP_Program;

public class M_SortArray_regular_method {
	public static void main(String[] args) {
		int[]a= {12,9,67,78,555,903,8885,56,90,66,90,45788,9};
		int empty=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				//if(a[i]>a[j])  // for ascending order
			  if(a[i]<a[j])  //for descending order
				{
					empty=a[i];
					a[i]=a[j];
					a[j]=empty;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
