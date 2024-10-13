package a8_inheritance;

public class Prc2ChildSimpleInheritance extends Prc1ParentSimpleInheritance{
public static void main(String[]args)
{
	m1();
	Prc2ChildSimpleInheritance obj=new Prc2ChildSimpleInheritance();
	obj.m2();
	
}

}
//Inheritance--It represents the relationship through which every property of parent class 
//              will be available to child class by default.
// This relationship is established by using "extends" keyword.
// ie means child class get the property of parent class.
//Types of Inheritance--1)simple inheritance
//                      2)Hierarchical inheritance
//                      3)Multi-level inheritance
//1)Simple/Single inheritance-1)In this 1 parent class & 1 child class is present,
//               then we accuire the properties of parent class to child class.(one parent class get extended in one child class)
///In regular way we to call non static method from diff class.At that time we have to create the object of class where the non static method is present.
/// & to call static method from diff class.At that time we call directly by class name.method name(class name of that class where static method is present)
///But this is avoided in inheritance by using "extends" keyword.
///Limitations of inheritance:
//1)multiple & cyclic inheritance is not possible.
///Advantages-Reusablity.

///another is if there m1 which is present in parent class 1 as parent class 2 then jdk will confuse to identify  m1 is  present in parent class 1 or parent class 2
//cyclic inheritance --- there is no purpose of inheritence/extends
//What is diamod ambiguity problem---suppose the m1 method is present in class A as well as class B & we have  to extend class A & class B m1 method inside the child class 
///then jdk will confuse to identify the m1 method which is present in class A & class B.Because the name of method same in both class.
// This diamond ambiguty problem overcome by interface as well as compostion.