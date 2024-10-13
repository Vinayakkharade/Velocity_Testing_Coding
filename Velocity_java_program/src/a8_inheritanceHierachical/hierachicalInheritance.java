package a8_inheritanceHierachical;

class animal
{
 void eat()//parent class
 {
 System.out.println("animals eating");
 }
}

class dog extends animal  ///child class
{
 void bark()
{
	System.out.println("dog is barking");
}
}
class cat extends animal   /// child class 
{
void mew()
{
	System.out.println("cat is mewing");
}

}

public class hierachicalInheritance {
	
public static void main(String[] args) {
		
	cat cobj=new cat();
	  cobj.mew();
	  cobj.eat();
	  dog dobj=new dog();
	  dobj.bark();
	  dobj.eat();
	
}

}
