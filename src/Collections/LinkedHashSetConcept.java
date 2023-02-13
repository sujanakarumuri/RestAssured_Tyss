package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetConcept {

	public static void main(String[] args) {			
				
				LinkedHashSet<Object> set=new LinkedHashSet<Object>();
				
				set.add(20);
				set.add(20);
				set.add(10);
				set.add("hi");
				set.add("hello");
				set.add(null);
				set.add(null);
				set.add("HaiHello");
				System.out.println(set);
		        System.out.println(set.contains("hi"));
		        System.out.println(set.isEmpty());
		        System.out.println(set.remove(10));
		        if(set.contains("hello"))
		        {
		        	System.out.println("hello is present in set");
		        }
		        else
		        {
		        	System.out.println("Hello is not present");
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
