package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add("Hi");
		list.add(null);
		list.add(null);
		list.add(7);
		System.out.println(list);
		list.add(2,"Hello");
		System.out.println(list);

		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(20);
		list2.add(10);
		list2.add(5);
		list2.add(30);
		System.out.println(list2);
		
		Collections.sort(list2);  //used to sort the elements
		System.out.println(list2);//print the sorted output in console
		
		list.addAll(list2);
		System.out.println(list);
		
		if(list.contains("Hi"))
		{
			System.out.println("Hi is present");
			
		}
		else
		{
			System.out.println("Hi is not present");
		}
     
		list.remove(0);
		System.out.println(list);
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}

}
