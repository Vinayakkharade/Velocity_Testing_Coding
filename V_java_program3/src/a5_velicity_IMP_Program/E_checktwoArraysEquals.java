package a5_velicity_IMP_Program;

import java.util.Arrays;

public class E_checktwoArraysEquals {
public static void main(String[] args) {
	  int[]a= {12,56,90,12};
	  int[]b= {12,56,90,12};
	  int[]c= {45,56,96,12};
	  
	  System.out.println(Arrays.equals(a, b));
	  System.out.println(Arrays.equals(a, c));
	  System.out.println(Arrays.equals(b, c));
}
}
