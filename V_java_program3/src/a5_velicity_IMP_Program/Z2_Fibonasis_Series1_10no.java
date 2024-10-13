package a5_velicity_IMP_Program;

public class Z2_Fibonasis_Series1_10no {
	public static void main(String[] args) {
		int a=0;//1//1//2//3//5
		int b=1;//1//2//3//5//8
		int c=0;
		for(int i=1;i<=10;i++) {	
			System.out.print(c+"  ");
			c=a+b;//1//2//3//5//8//13
		
		    a=b;
		    b=c;
		    
		}
	}
}
