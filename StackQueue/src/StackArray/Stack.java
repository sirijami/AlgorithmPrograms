package StackArray;

import java.util.EmptyStackException;

public class Stack {
	private int[] stackArray;
	private int top;
	
	public Stack(){
		stackArray = new int[10];
		top = -1;
	}
	/*Overriding the constructor */
	public Stack(int maxsize){
		stackArray = new int[maxsize];
		top = -1;
	}
	
	public int size(){
		return top + 1;
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public boolean isFull(){
		return (top == stackArray.length -1);
	}
	public void push(int data){
		if(isFull()){
			System.out.println("Cannot insert - exceeding the stack size");
			return;
		}
		top = top + 1;
		stackArray[top] = data;		
	}
	
	public int pop(){
		int element;
		if(isEmpty()){
			System.out.println("No more elements- cannot pop");
			throw new EmptyStackException();
		}
		element = stackArray[top];
		top = top -1;
		return element;
	}
	
	public int peek(){
		int element;
		if(isEmpty()){
			System.out.println("No more elements- cannot pop");
			throw new EmptyStackException();
		}
		element = stackArray[top];
		return element;
	}
	public void displayStack(){
		if(isEmpty()){
			System.out.println("Empty stack");
			return;
		}
		for(int i = top; i >= 0; i--){
			System.out.println(stackArray[i] + " ");
		}
		System.out.println();
	}
	

}
