package chap4;

public class LinkedListStack {
	private Node top;
	
	public LinkedListStack() {
		this.top = null;
	}
	public void push(int item) {
		Node newNode = new Node(item);
		newNode.next = top;
		top = newNode;
	}
	public void pop() {
		 if (isEmpty()) {
	            System.out.println("Stack is empty");
	     }
	     top = top.next;
	}
	public int peek() {
		 if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;  
	     }
	     return top.data;
		
	}
	public boolean isEmpty() {
		return top == null;
		}
	
	public void printStack(){
		 if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return;
	     }
		 
		 Node currentNode = top;
		 System.out.print("Stack: ");
		 while(currentNode != null) {
			 System.out.print(currentNode.data + " ");
			 currentNode = currentNode.next;
		 }
		 System.out.println();
	}
}
