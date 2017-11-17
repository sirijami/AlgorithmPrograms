package leetCodeAlgoEasy;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArrray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3};
		System.out.println(removeDuplicates(arr));

	}
    public static int removeDuplicates(int[] nums) {
    	if(nums[0] == nums[nums.length-1]){
    		return 1;
    	}
    	
    	for(int i = 0 ; i <= nums.length-1; i++){
    		int next = i+1;
    		if(nums[i] == nums[next]){
    			System.out.println("i " + i);
    			System.out.println("next " + next);
    			int temp = nums[next];
    			nums[next] = nums[next+1];
    			nums[next+1] = temp;
    			printArray(nums);
//        		if(nums[next] > nums[next+1]){
//        			return next+1;
//        		}    			
    		}

    	}
		return nums.length;        
    }
	private static void printArray(int[] nums) {
		for(int i = 0 ; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
	}

}
