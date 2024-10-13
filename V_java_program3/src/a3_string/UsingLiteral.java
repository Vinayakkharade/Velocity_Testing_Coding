package a3_string;

public class UsingLiteral {
  public static void main(String[] args) {
	String s1="vinayak";
	   s1="sham";
	   
	   System.out.print(s1);
}
}
//initially s1="vinayak"--so one object is created for string value "vinayak"in scp area & ref variable s1 is pointing to "vinayak"
//s1="sham";---now new object "sham"is created & ref variable  s1 is pointing to "sham" so there is no refernce found to previous 
/// object "vinayak"  then it get coolected iby garbage collector.

// String is by default final & immutable(jat kihihi badal honar nahi)
//Upon the changing string object content it will create always new object
//It will not update or change previous object content.
// This proves that string by default final & immutable.