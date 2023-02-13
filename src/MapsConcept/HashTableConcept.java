package MapsConcept;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		map.put(10,"hi");
		map.put(20,"hello");
		map.put(10,"hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(3,"hello");//duplicate values are allowed
		//map.put(null, "abc");//null key and null value not allowed
		//map.put(4, null);
		
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.containsKey(20));
		System.out.println(map.containsValue("bye"));
		System.out.println(map.containsValue("super"));
		System.out.println(map.get(10));
		System.out.println(map);
		
		
		

	}

}
