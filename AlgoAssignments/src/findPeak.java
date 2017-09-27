/* Find the peak element in the array
 * Assuming it's sorted in increasing and then in decreasing order
 * Assuming one peak element exists in the array
 */

public class findPeak {

	public static void main(String[] args) {
		int[] arr = {};
		System.out.println("The peak element is " + findPeakElement(arr) ); 
	}
	
	static int findPeakElement(int[] arr){
		return findPeakElement(arr, 0, arr.length-1);
	}

	private static int findPeakElement(int[] arr, int low, int high) {
		if(arr == null || arr.length == 0){
			System.out.println("No elements exists");
			return -1;
		}
		//Check for only one element in the array 
		if(arr.length == 1){
			return arr[arr.length-1];
		}
		int mid = (low + high) / 2;
		if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == arr.length -1 || arr[mid] >= arr[mid+1])){
			return arr[mid];
		} else if( (mid > 0) && (arr[mid] < arr[mid-1])){
			return findPeakElement(arr, low, mid-1);
		} else {
			return findPeakElement(arr, mid+1 , high);
		}
	}

}
