package chap6;

public class LinkedListQueueTest {

	public static void main(String[] args) {
		LinkedListQueue queue = new LinkedListQueue();
		
		queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
		System.out.print("Queue : ");
	        queue.printQueue();

	        System.out.println("Peek: " + queue.peek());

	        queue.dequeue();
		System.out.print("Queue : ");
	        queue.printQueue();
	        System.out.println("Peek: " + queue.peek());

	}

}
