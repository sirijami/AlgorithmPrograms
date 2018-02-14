package StackLinkedList;

import java.util.EmptyStackException;

public class StackL {
	Node top;
	
	public StackL(){
		top = null;
	}
	
	public int size(){
		int size = 0;
		if(top == null){
			System.out.println("stack is empty");
			return size;
		}
		Node p = top;
		while(p != null){
			p = p.link;
			size++;
		}
		return size;		
	}
	public boolean isEmpty(){
		return (top == null);
	}
	public void push(int data){
		/* Since it's a linked list you can add as many elements to the stack 
		 * and no need to check whether stack is full or not.
		 * But you should always check whether stack is empty or not
		 * While inserting a new node in a stack you always insert in the beginning
		 */
		Node temp;
		if(isEmpty()){
			temp = new Node(data);
			top = temp;
			return;
		}
		temp = new Node(data);
		temp.link = top;
		top = temp;		
	}
	
	public int pop(){
		int element;
		if(isEmpty()){
			System.out.println("No element exists");
			throw new EmptyStackException();
		}
		element = top.info;
		top = top.link;
		return element;		
	}
	public int peek(){
		int element;
		if(isEmpty()){
			System.out.println("No element exists");
			throw new EmptyStackException();
		}
		element = top.info;
		return element;			
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("No element exists");
			throw new EmptyStackException();
		}
		Node p = top;
		while(p != null){
			System.out.println(p.info + " ");
			p = p.link;
		}
		System.out.println();
		
	}
	

}
