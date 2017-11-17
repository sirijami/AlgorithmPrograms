package leetCodeAlgoEasy;

import java.util.Arrays;

public class missingNumberInArray {

	public static void main(String[] args) {
		int[] arr = {1000,-1};
		System.out.println(missingNumber(arr));

	}
    public static int missingNumber(int[] nums) {
    	Arrays.sort(nums);
    	for(int i = 0 ; i < nums.length; i++){
    		if(nums[i] != i){
    			return i;
    		}
    	}
		return nums.length;
        
    }

}
