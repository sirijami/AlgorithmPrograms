package leetCodeAlgoEasy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class nextGreaterEleOne {

	public static void main(String[] args) {
		int[] arr1 = {4,1,2};
		int[] arr2 = {1,3,4,2};
		nextGreaterElement(arr1, arr2);

	}  
	private static int[] nextGreaterElement(int[] arr1, int[] arr2) {
		
		int[] result = new int[arr1.length];
		for(int i = 0 ; i < arr1.length ; i++){
			for(int j = 0 ; j < arr2.length; j++){
				if(arr1[i] == arr2[j]){
					int max = arr2[j];
					System.out.println("Max " + max);
					for(int m = j+1 ; m < arr2.length; m++){
						System.out.println("array " + arr2[m]);
						if(arr2[m] > max){
							max = arr2[m];
							System.out.println("current max " + max);
							result[i] = max;
						}
					}
				}
			}
		}
		printArray(result);
		return result;		
	}
	
	static void printArray(int arr[]){
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}




}
