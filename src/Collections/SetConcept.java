package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetConcept {

	public static void main(String[] args) {
		
		HashSet<Object> set=new HashSet<Object>();
		set.add(10);
		set.add("hi");
		set.add(20);
		set.add("hello");
		set.add("hello");
		set.add(30);
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(20));
		System.out.println(set);
		System.out.println("size of set ="+set.size());
		if(set.contains("hi"))
		{
			System.out.println("Hi is present in set");
		}else
		{
			System.out.println("Hi is not present in set");
		}
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		Iterator<Object> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
