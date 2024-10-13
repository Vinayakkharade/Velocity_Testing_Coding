package aa_imp_program;

public class Num4_armStrong {
public static void main(String[] args) {
	int num=153;
	int length=0;
	int t1=num;
	
	while(t1!=0) {
		num=num/10;//15/1/0
		length++;//1/2/3
	     }
	
	int t2=num;
	int arm=0;
	int rem=0;
	while(t2!=0)
	{
		int multiple=1;
		rem=t2%10;
		for(int i=1;i<=length;i++)
		{
			multiple=multiple*rem;
		}
		arm=arm+multiple;
			t2=t2/10;
		}
		if(num==arm)
		{
			System.out.println("no is arm strong");
		}
		else
		{
			System.out.println("no is arm strong");
		}
	
	
}
}
