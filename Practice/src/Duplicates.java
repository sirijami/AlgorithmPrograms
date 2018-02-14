import java.util.HashSet;


public class Duplicates {

	public static void main(String[] args) {
		int[] arr = {1,1};
		System.out.println(1235 %  10);
		System.out.println(removeDuplicates(arr));
	}
	
	public static int removeDuplicates(int[] nums){
		 if(nums == null || nums.length == 0){
	            return 0;
	        }
	        if(nums.length ==1){
	            return nums[0];
	        }
	        int i = 0;
	        int j = i+1;
	        for(; j< nums.length; j++){
	        	if(nums[i] != nums[j]){
	        		i++;
	        		nums[i] = nums[j];
	        	}
	        }
	        printArray(nums);
	        return i+1;
	}

	private static void printArray(int[] nums) {
		
		
	}

}
