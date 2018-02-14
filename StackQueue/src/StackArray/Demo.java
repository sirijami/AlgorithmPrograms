package StackArray;

public class Demo {

	public static void main(String[] args) {
		Stack s = new Stack(7);
		s.displayStack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.displayStack();
		System.out.println(s.size());
		System.out.println(s.peek());
		s.pop();
		s.displayStack();

	}

}
