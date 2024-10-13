package a8inheritence_prc3;

public class Child extends ParentClass{
	public Child(int a) {
	    super(10);
		System.out.println("child class");
	}
	
public static void main(String[]args) {
	Child obj=new Child(15);
}

}
