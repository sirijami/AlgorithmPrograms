package leetCodeAlgoEasy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class nextGreaterEleOne {

	public static void main(String[] args) {
		int[] arr1 = {4,1,2};
		int[] arr2 = {1,3,4,2};
		nextGreaterEleOne obj = new nextGreaterEleOne();
		Integer[] temp = obj.nextGreaterElement(arr1, arr2);
		printArray(temp);
//		ArrayList<Integer> temp = obj.nextGreaterElement(arr1, arr2);
//		System.out.println(temp);
		
		
     
	}

    
	private Integer[] nextGreaterElement(int[] arr1, int[] arr2) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0 ; i < arr1.length ; i++){
			for(int j = 0; j < arr2.length ; j++){
				if( arr2[j] > arr1[i]){
					result.add( arr2[j]);
					i++;
					j++;
				}
			}
			result.add(-1);	
		}
		 Integer[] intArray = result.toArray(new Integer[result.size()]);
		return intArray;  		
	}
	
	static void printArray(Integer arr[]){
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}




}
