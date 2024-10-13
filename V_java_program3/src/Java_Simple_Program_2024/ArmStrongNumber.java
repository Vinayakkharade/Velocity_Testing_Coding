package Java_Simple_Program_2024;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num =153;

		int temp = num;
		int reminder= 0;
		int result =0;

		while(temp!=0) {
			reminder=temp%10;//3//5
			result=result+(reminder*reminder*reminder);//27+125
			temp=temp/10;//15//1//
		}
		
		if(result==153) {
			System.out.println("given number is arm strong number");
			
		}
		else {
			System.out.println("Given number is not armstrong number");
		}
			
	}

}
