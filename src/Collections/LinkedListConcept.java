package Collections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<Object> lt=new LinkedList<Object>();
		lt.add(10);
		lt.add("hi");
		lt.add(null);
		lt.add(10);
		lt.add(20);
		lt.addFirst("Bye");
		System.out.println(lt);
		lt.addLast(30);
		System.out.println(lt);
		System.out.println(lt.getFirst()); //get first
		System.out.println(lt.getLast());
		System.out.println(lt.get(1));
		System.out.println(lt.removeFirst());
		System.out.println(lt);
		System.out.println(lt.removeLast());
		System.out.println(lt);
		
		LinkedList<Object> lt1=new LinkedList<Object>();
		lt1.add(30);
		lt1.add("hi");
		lt1.add(10);
		lt1.add(0);
		lt1.add(5);
		System.out.println("List elements are="+lt);
		System.out.println("list1 elements are="+ lt1);
		lt.retainAll(lt1);  //show the duplicates present 
		System.out.println("retian elements(duplicates)="+lt);
		lt1.removeAll(lt); //remove the duplicates present in list2 w.r.t 
		System.out.println(" elements are="+lt1);
		lt.removeAll(lt1);
		System.out.println(lt);
		lt.addAll(lt1);
		System.out.println(lt);
     	for(Object ob:lt1)
		{
			System.out.println(ob);
		}
		
	}

}
