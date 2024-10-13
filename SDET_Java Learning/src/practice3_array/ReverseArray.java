package practice3_array;

public class ReverseArray {
public static void main(String[] args) {
	int num=0;
	int[]ar= {54,34,90,56,12};
	
	int length=ar.length;
	
	for(int i=length-1;i>=0;i--)
	{
		System.out.print(ar[i]+" ");
	}
}

}
