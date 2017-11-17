
public class moveZeros {

	public static void main(String[] args) {
		int[] arr = {0,3,0,-1,5,0,5,2,0,0,1};
		moveZeroesToEnd(arr);
	}

	private static void printArray(int[] arr) {
		for(int i= 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
	}

	private static void moveZeroesToEnd(int[] arr) {
		int front = 0;
		int end = arr.length-1;
		while(front < end){
			if(arr[front] == 0){
				int temp = arr[front];
				arr[front] = arr[end];
				arr[end] = temp;
				end--;
			} else{
				front++;
			}			
		}		
		printArray(arr);
	}

}

