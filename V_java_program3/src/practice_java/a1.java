package practice_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class a1 {
	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			int count =5;
			for(int j=5;j>=count;j--) {
				System.out.print("* ");
				count--;
			}
			count--;
			System.out.println("");
		}
	}

}
