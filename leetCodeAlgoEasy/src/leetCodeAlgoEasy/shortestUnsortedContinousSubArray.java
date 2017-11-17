package leetCodeAlgoEasy;

import java.util.Arrays;

public class shortestUnsortedContinousSubArray {

	public static void main(String[] args) {
		int[] arr = {2, 6,5};
		System.out.println(findUnsortedSubarray(arr));

	}
    public static int findUnsortedSubarray(int[] nums) {
    	if(nums.length == 0 || nums.length ==1){
    		return 0;
    	}
    	int[] copiedArray = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(copiedArray);
    	int i = 0;
    	while(i < nums.length && copiedArray[i] == nums[i]){
    		i++;
    	}
    	int j = nums.length-1;
    	while(j > 0 && copiedArray[j] == nums[j]){
    		j--;
    	}
    	if(j - i+1 > 0){
    		return j - i+1;
    	}
    		

		return 0;
        
    }

}
