package a5_velicity_IMP_Program;

public class F_SecondLargestValue {

public static void main(String[] args) {
	int empty=0;
	int[]a={56,990,12,4570,76,880,12,990};

	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				empty=a[i];
			    a[i]=a[j];
				a[j]=empty;
			}
		}	
	}

	System.out.println(a[1]);
	System.out.println(a[a.length-2]);//
}
}
// 2nd largest no is possible. but it duplicate no are present then it will not give the 3rd highest no is not possible