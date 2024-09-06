package chap3;

public class ArrayStackTest {

	public static void main(String[] args) {
		ArrayStack myStack = new ArrayStack(10);
		
		myStack.push(5);
		myStack.push(6);
		myStack.push(7);
		myStack.push(8);
		
		myStack.printStack();
		System.out.println("\n************");
		
		System.out.print(myStack.peek());
		System.out.println("\n************");
		
		myStack.pop();
		myStack.pop();
		myStack.printStack();
	}

}
