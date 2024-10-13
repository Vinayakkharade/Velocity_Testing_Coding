package Practice_2024;

import java.util.ArrayList;

public class A7_Reverse_word_inArray {

	public static void main(String[] args) {

		String[]ar= {"vinayak","soham","sarita","vihaan"};

		ArrayList<String>al=new ArrayList<>();

		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
			al.add(ar[i]);
		}
	}

}
