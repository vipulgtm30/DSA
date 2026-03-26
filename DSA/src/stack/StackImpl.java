package stack;

import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization
		Stack<Integer> stack = new Stack<>();
		
		//Add an element
		stack.push(5);
		stack.push(20);
		stack.push(3);
		stack.push(10);
		
		System.out.println(stack);
		
		
		//size of the stack
		int size = stack.size();
		System.out.println("Size of the stack: " +size);
		
		//printing the top element
		int topElement = stack.peek();
		System.out.println("Top element of the stack: " +topElement);
		
		//remove the element from stack
		int removedElement = stack.pop();
		System.out.println("Removed element: " +removedElement);
		
		/* 
		 * search if element is present
		 * index if present and the index will be in the reverse order
		 * otherwise we'll get -1 
		 */ 
		int pos1 = stack.search(10);
		System.out.println("Search if 10 is present: "+pos1);
		
		int pos2 = stack.search(5);
		System.out.println("Search if 5 is present: "+pos2);
		
		System.out.println("Stack after all the operations");
		System.out.println(stack);
	
	}

}
