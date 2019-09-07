package co.concepts;

import java.util.PriorityQueue;

public class queueTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		// Queue: (front )10 9 8 7 6 5 4 3 2 1 (Rear)
		// PriorityQueue sorts data for us into this mess-- need to find the reason
		// Queue : (front )1 2 5 4 3 9 6 10 7 8 (Rear) 
		System.out.println("Queue size is "+queue.size());
		//peek operation shows the head of the queue
		//poll operation removes the head of the queue
		System.out.println("Peek operation "+queue.peek());
		queue.poll();
		System.out.println("Queue size after polling is "+queue.size());
		
		
		//Priority queue orderes the elements in the queue with respect to their natural ordering
		//It sorts them using COllections.sort
		// sorting happens only on dequeue
		
		//EXAMPLE BELOW
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
//		queue.poll();
//		System.out.println(queue.peek());
		
	
	}

}
