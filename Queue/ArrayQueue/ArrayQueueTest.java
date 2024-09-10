package chap5;

public class ArrayQueueTest {

	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(1000);
		
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		System.out.print("Queue : ");
		queue.printQueue();
		
		queue.pop();
		queue.pop();
		queue.push(6);
		System.out.print("Queue : ");
		queue.printQueue();
		
		System.out.println("Peek : " + queue.peek());
		
	}

}
