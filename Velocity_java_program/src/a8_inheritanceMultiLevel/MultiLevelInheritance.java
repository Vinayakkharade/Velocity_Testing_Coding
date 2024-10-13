package a8_inheritanceMultiLevel;

class A{
	void m1() {
		System.out.println("parent class A");
	}
}

class B extends A{
	void m2() {
		System.out.println("child class B");
	}
}

class C extends B{
    void m3() {
    	System.out.println("child class C");
    }
}

public class MultiLevelInheritance {
  public static void main(String[]args) {
	  C obj=new C();
	  obj.m1();
	  obj.m2();
	  obj.m3();
  }
}
	
	

