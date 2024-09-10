package chap5;

public class ArrayQueue {
	int size;
	int front;
	int rear;
	int[] queue;
	
	public ArrayQueue(int size) {
		this.size = size;
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	public boolean isFull() {
		return rear == size -1;
	}
	public boolean isEmpty() {
		return front == rear;
	}
	public void push(int item) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		queue[++rear] = item;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue[++front];
		
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue[front+1];
	}
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		for(int i = front+1; i<= rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
}
