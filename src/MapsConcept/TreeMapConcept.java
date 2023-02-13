package MapsConcept;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(10,"hi");
		map.put(20,"hello");
		map.put(15,"hello");//duplicate key is not allowed
		map.put(5, "bye");
		map.put(14,null);//allowed
		map.put(6,"abc");//allowed
		map.put(4, null);
		
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
