package linkedList;

public class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		
		//by default the value of properties is null
		//next = null;
	}

}
