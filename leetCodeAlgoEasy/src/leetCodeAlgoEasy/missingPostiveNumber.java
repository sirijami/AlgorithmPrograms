package leetCodeAlgoEasy;

import java.util.Arrays;

public class missingPostiveNumber {

	public static void main(String[] args) {
		int[] arr= {1000,-1};
		System.out.println(firstMissingPositive(arr));
	
	}
	 public static int firstMissingPositive(int[] nums) {
	        if(nums.length < 1){
	            return 1;
	        }
	        
	        Arrays.sort(nums);
	        for(int i = 0 ; i < nums.length ; i++){
	        	if(nums[i] > 0){

	        	}

	        }
	        return nums.length;
	    }

}
