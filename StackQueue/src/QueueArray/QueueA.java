package QueueArray;

import java.util.NoSuchElementException;

public class QueueA {
	private int[] QueueArray;
	private int front;
	private int rear;
	
	public  QueueA(){
		QueueArray = new int[10];
		front = -1;
		rear = -1;
	}
	public  QueueA(int maxsize){
		QueueArray = new int[maxsize];
		front = -1;
		rear = -1;
	}
	public boolean isEmpty(){
		if(front == -1 || front == rear + 1){
			return true;
		}
		return false;
	}
	public boolean isFull(){
		return rear == QueueArray.length -1;
	}
	public int size(){
		if(isEmpty()){
			return 0;
		}else {
			return rear-front+1;
		}		
	}
	public void insert(int data){
		if(isFull()){
			System.out.println("Queue overflow");
			return;		
		}
		if(front == -1){
			front = 0;
		}
		rear = rear+1;
		QueueArray[rear] = data;		
	}
	public int delete(){
		int element;
		if(isEmpty()){
			System.out.println("Queue underflow");
			throw new NoSuchElementException();
		}
		element = QueueArray[front];
		front = front + 1;
		return element;
	}
	public int peek(){
		int element;
		if(isEmpty()){
			System.out.println("Queue underflow");
			throw new NoSuchElementException();
		}
		element = QueueArray[front];
		return element;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		for(int i = front; i<= rear; i++){
			System.out.print(QueueArray[i] + " ");
		}
		System.out.println();
	}
	

}
