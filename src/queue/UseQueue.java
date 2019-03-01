package queue;

import java.util.LinkedList;
import java.util.Queue;


public class UseQueue {
    // we use FIFO. 
	// PEEK= check LAST IN. POP = print top element. PUSH=add element. 
	public static void main(String[] args) {

		
		Queue<String> queue = new LinkedList();// create of object type queue list
		queue.add("ny");//assignment of value.
		queue.add("pa");//assignment of value.
		queue.add("fl");//assignment of value.
		queue.add("ca");//assignment of value.
		
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
		
	}

}
