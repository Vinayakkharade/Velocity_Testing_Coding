package a5_velicity_IMP_Program;
// check the arm strong no
public class A_ArmStrongNoFind {
public static void main(String[] args) {
	int num=153;
	int temp=num;
	int reminder=0;
	int result=0;
	
	while(temp!=0)
	  {
		reminder=temp%10;//1//7//
		result=result+(reminder*reminder*reminder);//1//
		temp=temp/10;//37//
	  }
	if(num==result)
		System.out.print("Armstrong num");
	else
		System.out.print("Not Armstrong num");
     }
	
}
