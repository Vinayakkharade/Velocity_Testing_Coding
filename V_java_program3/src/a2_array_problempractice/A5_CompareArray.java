package a2_array_problempractice;

import java.util.Arrays;

public class A5_CompareArray {
public static void main(String[] args) {
    int[]a= {12,56,90,12};
    int[]b= {12,56,90,12};
    int[]c= {45,56,96,12};
   
    System.out.println(Arrays.equals(a, b));
    System.out.println(Arrays.equals(a, c));
    System.out.println(Arrays.equals(b, c));
}
}
