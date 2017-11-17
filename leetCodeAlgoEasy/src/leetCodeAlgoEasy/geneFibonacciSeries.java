package leetCodeAlgoEasy;

//This fibonacci series generation is O(n) order of time.

public class geneFibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 10;
		fibonacciSeries(firstNum);
	}

	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
	}

	private static int[] fibonacciSeries(int firstNum) {
		int[] result  = new int[10];
		int prevFirstNum = 0;
		int temp = 0;		
		result[0] = prevFirstNum;
		result[1] = firstNum;
		for(int i = 2 ; i < 10; ++i ){
			temp =  firstNum + prevFirstNum;
			result[i] = temp;
			prevFirstNum = firstNum;
			firstNum = temp;			
		}
		printArray(result);
		return result;		
	}

}
