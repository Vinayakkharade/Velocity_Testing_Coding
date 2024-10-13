package a3_Interface;

abstract class ChildClass implements ParentClass {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 is abstract method present in parent class");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 is abstract method present in parent class");
	}

	@Override
	public abstract void m3();
		// TODO Auto-generated method stub
		
	

}
