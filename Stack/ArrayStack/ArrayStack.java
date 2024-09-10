package chap3;

public class ArrayStack {
	int top;
	int size;
	int[] stack;
	
	public ArrayStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	public void push(int item) {
		if(IsFull()) {
			System.out.println("stack is full");
		}else {
		    stack[++top] = item;
		}
	}
	public void pop() {
		if(IsEmpty()) {
			System.out.println("stack is empty");
		}else{
			stack[top--] = 0;
		}
	}
	public int peek() {
		if(IsEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}else {
			return stack[top];
		}
	}
	public boolean IsEmpty() {
		return top==-1;
	}
	public boolean IsFull() {
		return top== size-1;
	}
	public void printStack() {
		if (IsEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i = 0; i<= top;i++)
			System.out.print(stack[i]+" ");
		System.out.println();
	}
	
}
