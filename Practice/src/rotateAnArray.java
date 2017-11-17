/* Problem: Rotate an array
 * Solution: Reverse the entire array and then reverse the sub array starting from n times rotation 
 * Time complexity : O(n + n) => O(2n) => O(n)
*/
public class rotateAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		rotateArr(arr, 2);
	}
    //n time rotation
	private static void rotateArr(int[] arr, int n) {
		reverseArray(arr, 0, arr.length-1, n);
		printArray(arr);
		reverseArray(arr, 0, n-1,n);
		printArray(arr);		
	}

	private static int[] reverseArray(int[] arr, int start,int  end, int n) {
		if(arr.length <= n){
			return arr;
		}
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
