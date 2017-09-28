/* Problem: To reverse an array 
 * Solution: Iterative way. 
 * Steps: Take two pointers one at the start and another at the end and start swapping 
 * Time complexity is O(n)
 */
public class reverseArray {

	public static void main(String[] args) {
		int[] arr = {2,1,4,28,49};
		int[] result = reverseArr(arr);
		printArray(result);
	}

	private static void printArray(int[] result) {
		for(int i=0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();		
	}
    //Iterative way
	private static int[] reverseArr(int[] arr) {
		printArray(arr);
		int i = 0;
		int j = arr.length-1;
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}
	//Recursive way
//	private static int[] reverseArr(int[] arr){
//		return reverseArrRec(arr, 0, arr.length-1);		
//	}
//
//	private static int[] reverseArrRec(int[] arr, int i, int j) {
//		while(i < j){
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			reverseArrRec(arr, i+1, j-1);	
//		}
//		return arr;
//	}

}
