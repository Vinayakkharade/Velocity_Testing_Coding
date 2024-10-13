package a2_abstraction11;

abstract class Parent1 {
	

		public void m1()
		{
			System.out.println("m1 parent class implementted method");
		}
		
		public static void m2()
		{
			System.out.println("m2 parent class implementted method");
		}
		public void m3(boolean c)
		{
			System.out.println("m3 parent class implementted method");
		}
		
		abstract void m4();
}
//We can implement the static method in a abstract class having complete body of that static method.
//means complete implimentation should be is req of static method when we declare in abstract class.
//  & call directly by method name.