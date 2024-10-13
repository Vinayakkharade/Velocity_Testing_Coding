package a1_array;

public class a1_array1new {
	public static void main(String[] args) {
		  int[]ar=new int[5];/// 1st way declaring array-using new keyword
		   ar[0]=12;
		   ar[1]=23;
		   ar[2]=45;
		   ar[3]=55;
		   ar[4]=99;
		
		   for(int i=0;i<ar.length;i++)
			   System.out.println(ar[i]);   
	}
}
//Array--Array is collection of similar/homogenious kind of data types.
//while creating the array object is created at back end for storing the values.
// suppose array consist a,b,c,d are char then size of array o array= 4 & range of array from 0 to 3. 
// Arrays-It is a class in collection framework which consist the methods related with array.
//Array declaring using new keyword is not convinent because 1) As per memory optimazation concern,as it creates 2 object.
// array itself creates one object & using another object is created.(one in heap area & stack area)
//2) program becomes lengthy,ie  we  req add values saparately to each index