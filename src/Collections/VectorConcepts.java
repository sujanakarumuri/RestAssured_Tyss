package Collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorConcepts{

	public static void main(String[] args) {
		
	     Vector<Object> vec=new Vector<Object>();
	     vec.add(10);
	     vec.add(20);
	     vec.add(10);
	     vec.add("Hi");
	     vec.add(null);
	     vec.add(null);
		System.out.println(vec);
		vec.add(2,"Hello");
		System.out.println(vec);
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println(vec.indexOf("Hi"));
		vec.add(4,"hello");
		System.out.println(vec);

	}

}
