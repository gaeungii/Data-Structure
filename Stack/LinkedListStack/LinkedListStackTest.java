package chap4;

public class LinkedListStackTest {

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.printStack();  
        
        stack.pop(); 
        stack.printStack();  
        
        stack.pop();
        stack.printStack();  
        
        stack.pop();  
        stack.printStack();  
    
	}

}
