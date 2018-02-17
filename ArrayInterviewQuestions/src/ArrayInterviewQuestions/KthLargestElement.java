package ArrayInterviewQuestions;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] arr = {1,2};
		int[] result = rotateArray(arr, 0);
		printArray(result);
		
	}

	private static void printArray(int[] result) {
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();
		
	}

	private static int[] rotateArray(int[] nums, int k) {      
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
        
        return nums;
	}
	
	public static void reverse(int[] nums, int start, int end){
        while(start < end ){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
