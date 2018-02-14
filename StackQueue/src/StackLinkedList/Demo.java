package StackLinkedList;

public class Demo {

	public static void main(String[] args) {
		StackL stack = new StackL();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Stack size " + stack.size());
		stack.display();
		System.out.println("Top element " + stack.peek());
		stack.pop();
		stack.pop();
		stack.display();
		System.out.println("Top element " + stack.peek());
		
		

	}

}
