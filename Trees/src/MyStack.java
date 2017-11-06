import java.lang.reflect.Array;


public class MyStack {
	int lastInputPointer;
	int stackSize;
	static int[] stackArray;
	
	public MyStack(int size){
		lastInputPointer = -1;
		stackSize = size;
		stackArray = new int[stackSize];
	}
	
	//Push the element to the end of array
	public void push(int num){
		if(lastInputPointer < stackSize){
			lastInputPointer++;
			if(lastInputPointer < stackSize){
				stackArray[lastInputPointer] = num;
			}else {
				throw new ArrayIndexOutOfBoundsException("Stack Overflow");
			}
		}		
	}
	
	//Remove the element from the end
	public int pop(){
		if(lastInputPointer == -1){
			throw new NullPointerException("Stack is empty");
		}
		int pointerLocation = lastInputPointer;
		lastInputPointer--;
		return stackArray[pointerLocation];
	}
	
	//Read the element from the end 
	public int peek(){
		if(lastInputPointer == -1){
			throw new NullPointerException("Stack is empty, No element to peek");
		}
		return stackArray[lastInputPointer];
	}
	
	//Print Stack
	public static void printStack(int[] arr){
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MyStack ms = new MyStack(4);
		
//		Test Cases
//		//Pop when stack is empty
//		ms.pop();
//		
//		//Push elements till stack limit		
//		ms.push(1);
//		ms.push(2);
//		ms.push(3);
//		ms.push(4);
//		
//		//Push more than stack limit
//		ms.push(5);
//		
//		//Pop all elements
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
//		System.out.println(ms.pop());
		printStack(stackArray);
	}
	
	
	

}
