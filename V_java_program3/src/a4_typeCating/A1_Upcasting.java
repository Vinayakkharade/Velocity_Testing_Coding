package a4_typeCating;

public class A1_Upcasting {
public static void main(String[] args) {
	       byte a=125;
	
	       int b=(int)a;
	        System.out.println(b);
}
}
// casting :-- it is method of converting one data type into another data type.
// Two ways:1)up casting: converting lower data type into higher data type.
// In up casting there is no loss of information.(because max range of lower data type is available in higher data type.)
//syntax:higher data type variable name=(higher data type)ref.variable(lwr data type)

// up casting-- implict casting--widening 
// downcasting-- explicit casting--narrowing