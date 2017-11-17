package leetCodeAlgoEasy;

public class moveEvenAndOdd {

	public static void main(String[] args) {
		int[] arr = {-1};
		evenAndOdd(arr);
	
	}
	public static int[] evenAndOdd(int[] arr){
		int j = arr.length-1;
		int i = 0;
		int count = 0;
		while(i < j){
			if (arr[i] % 2 == 0){
				i++;
			} else if (arr[j] % 2 == 0){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					count++;
			} else {
				j--;
			}
		}		
		printArray(arr);
		return arr;		
	}
	private static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
	}

}
