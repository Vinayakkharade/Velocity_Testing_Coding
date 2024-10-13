package a5_velicity_IMP_Program;

public class G_SecondLowestValue {
	public static void main(String[] args) {
		int empty;
		int[]a={56,990,12,4570,76,880,10,990};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					empty=a[i];
					a[i]=a[j];
					a[j]=empty;
				}
			}
		}
		System.out.println(a[1]);

	}

}
