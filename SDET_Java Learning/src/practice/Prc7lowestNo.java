package practice;

public class Prc7lowestNo {
public static void main(String[]args) {
	

	int[]a={18,4,90,0};
	int min=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
			min=a[i];//4
		
	}
	System.out.println("min value="+min);
}
	
}
