package Collections;

import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		
		Stack<Object> st=new Stack<Object>();
		
		st.push(10);
		st.push(20);
		st.push("Sujana");
		System.out.println(st);
		System.out.println(st.pop()); //sujana
		System.out.println(st.pop()); //20
		System.out.println(st.pop());//10
		st.push(30);
		st.push(50);
		System.out.println(st);
		System.out.println(st.pop());
		

	}

}
