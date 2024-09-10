package chap6;

public class LinkedListQueue {
	private QueueNode front, rear;
	
	public LinkedListQueue() {
		this.rear = null;
		this.front = null;
	}
	public boolean isEmpty() {
		return front == null;
	}	
	public void enqueue(int item) {
		QueueNode newNode = new QueueNode(item);
		
		if(isEmpty()) {
			this.front = this.rear = newNode;
			return;
		}
		this.rear.next = newNode;
		this.rear = newNode;
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return ;
		}
		this.front = this.front.next;
		
		if(this.front == null) {
			this.rear = null;
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return this.front.data;
	}
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		QueueNode temp = front;
		while(temp != null) {
			System.out.print(temp.data + " ");
	        temp = temp.next;
		}
		System.out.println();
	}
	

}
