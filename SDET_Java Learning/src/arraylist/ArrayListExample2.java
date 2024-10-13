package arraylist;
import java.util.ArrayList;
public class ArrayListExample2 {
	
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();// allows all kind of data types
		
		
		System.out.println("Before add size="+al.size());///size of arraylist = al.size()
		//add the elements to arraylist
		al.add("vinu");
		al.add("kharade");
		al.add("007");
		
		System.out.println("After add size="+al.size());
		System.out.println("After add element="+al);
		//add the elements to arraylist
		al.add("@");
		al.add("com");
		
		System.out.println("After add size="+al.size());
		System.out.println("After add element="+al);
		
	
		al.add(4,"gmail");//add the elements to arraylist after 4 no.element
		System.out.println("After add element="+al);
		
		al.remove("007");/// remove the specified element
		al.remove("gmail");///remove the specified element
		System.out.println("After remove element="+al);
		
		al.add(2,"007");//add the elements to arraylist after 2 no.element===n
	    al.add(4,"gmail");///add the elements to arraylist after n+1 no.element
		System.out.println("After add size="+al.size());
		System.out.println("After add element="+al);
	}
}
//ArrayList= 1)it is data structure in java.
           //2)it overcome the drawback of array.
           //3)it can store any kind of data type.
           //4)it has not limit of element(ie.we can store any no of elements)