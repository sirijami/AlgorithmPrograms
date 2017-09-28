/* Problem: Rotate an array
 * Solution: Reverse the entire array and then reverse the sub array starting from n times rotation 
 * Time complexity : O(n + n) => O(2n) => O(n)
*/
public class rotateAnArray {

	public static void main(String[] args) {
		int[] arr = {2,34,6,78};
		printArray(arr);
		rotateArr(arr, 2);
	}
    //n time rotation
	private static void rotateArr(int[] arr, int n) {
		reverseArray(arr, 0, arr.length-1);
		printArray(arr);
		reverseArray(arr, n, arr.length-1);
		printArray(arr);		
	}

	private static int[] reverseArray(int[] arr, int start,int  end) {
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;			 
		}
		return arr;		
	}
	
	private static int[] printArray(int[] arr){
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return arr;
	}

}
