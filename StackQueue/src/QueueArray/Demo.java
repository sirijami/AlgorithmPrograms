package QueueArray;

public class Demo {

	public static void main(String[] args) {
		QueueA queue = new QueueA();
		queue.insert(1);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.display();
		System.out.println("Queue size " + queue.size() );
		System.out.println("First element " + queue.peek());
		queue.delete();
		queue.display();

	}

}
