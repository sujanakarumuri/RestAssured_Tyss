package Collections;

import java.util.PriorityQueue;

public class PriorityQueueConcept {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("hi");
		queue.add("hello");
		queue.add("hihello");
		queue.add("bye");
		queue.add("hihellobye");
		queue.add("goodbye");
		System.out.println(queue);
		System.out.println(queue.peek());//will fetch the data and not remove
		System.out.println(queue);
		System.out.println(queue.poll());//will fetch and remove
		System.out.println(queue);

	}

}
