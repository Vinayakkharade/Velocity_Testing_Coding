package a6_velocity_program;

  // Count No of words in String 

public class A12CountNoOfwordInString {
public static void main(String[] args) {
	
	String s1="Vinayak vihaan soham saurabh vedant shruti";
	int count=0;
	String[]a=s1.split(" ");
	 for(int i=0;i<a.length;i++)
	 {
		 
		 count++;
	 }
	 System.out.print(count);
}
}
