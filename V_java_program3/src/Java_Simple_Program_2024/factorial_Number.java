package Java_Simple_Program_2024;

public class factorial_Number {

    public static void main(String[] args) {
        
        int a = 6; // 6! = 6 x 5 x 4 x 3 x 2 x 1 = 720
        int factorial = 1;
        
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;//1//2//6//24//120//
        }
        
        System.out.println(factorial); // Output: 720
    }
}
