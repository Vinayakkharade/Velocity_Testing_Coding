package a6_velocity_program;

/// Count the no of occurrence 'A' character in String
public class A13_No_of_Occurance_of_char {

	public static void main(String[] args) {

		String s1 = "aacgdllllnmfacsata";
		     int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(ch=='a') {
				count++;	
			}
		}
		System.out.print("no of occurance of 'a' character="+count);
	
	}
}
