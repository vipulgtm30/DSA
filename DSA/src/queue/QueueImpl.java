package queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueImpl {
	
	public static void main(String[] args) {
		
		//Declaration
		Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();
		
		
		//Adding the elements in Queue
		q.add(10);
		q.add(25);
		q.add(13);
		
		System.out.println(q);
		
		//Peek the first element in queue
		System.out.println(q.peek());
		
		//Remove the first element in queue
		System.out.println(q.remove());
		
		System.out.println(q);
		
//		int sqaure = x -> x*x;
		
	}

}
