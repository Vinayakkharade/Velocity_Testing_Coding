package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class A4 {

	public static void main(String[] args) {
	int[]a= {100,50,40,45,900,100};
	
	List ls=new ArrayList();
	for(int num:a)
		ls.add(num);

	List<Integer>remove=(List<Integer>) ls.stream().distinct().collect(Collectors.toList());
	System.out.print(remove);
	}

}
