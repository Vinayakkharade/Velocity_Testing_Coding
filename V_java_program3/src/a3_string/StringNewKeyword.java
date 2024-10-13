package a3_string;

public class StringNewKeyword {
	public static void main(String[] args) {
		String s1=new String("vinayak");
		String s2=new String("vinayak");
		String s3=new String("kharade");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	

}
// String is basically an object that represents the sequence of char values.
// String is class present in java.lang.package which consist the methods related with string data type.
// String is declared by using two ways.1)Using new keyword 2)Using string literal

// String s1=new String("vihaan");--- using new keyword
// It creates the two object --one in heap memory & another is in Sring constant pool(scp) area.(occupy more memory)

//String s1="vihaan";--- this is simples & effective way of declaring the String
// it creates only one object in scp area.

//Memory allocation:
//1)heap memory-memory allocation for object
//2)method area-- memory allocation for method & variables
//3)stack area-- holds local variables,retured methods,invoked methods

//note---1)For any same String value new object will not be created in SCP area.It will check 1st whether object with same string value 
//// is available or not.
/// if available then it will not created new object.but not available then it create the new object for that string value.
//for String value "vinayak" only one object is created in scp area.

