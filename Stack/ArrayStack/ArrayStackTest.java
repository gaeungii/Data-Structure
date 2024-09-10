package chap3;

public class ArrayStackTest {

	public static void main(String[] args) {
		ArrayStack myStack = new ArrayStack(10);
		
		myStack.push(5);
		myStack.push(6);
		myStack.push(7);
		myStack.push(8);

		System.out.print("Stack : ");
		myStack.printStack();
				
		System.out.print("Peek : " + myStack.peek());
		
		myStack.pop();
		myStack.pop();
		System.out.print("Stack : ");
		myStack.printStack();
	}

}
