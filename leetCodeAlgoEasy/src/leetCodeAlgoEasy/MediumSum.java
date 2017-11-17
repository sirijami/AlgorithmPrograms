package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediumSum {

	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
		threeSum(arr);

	}
    public static List<List<Integer>> threeSum(int[] nums) {
    	 Arrays.sort(nums);
     	List<List<Integer>> res = new ArrayList<>();
     	if(nums.length ==3){
     		int sum = nums[0] + nums[1] + nums[2];
     		if(sum == 0){
     			res.add(Arrays.asList(nums[0],nums[1], nums[2]));   			
     			return res;
     		}   		
     	}
     	
     	for(int i = 0; i < nums.length-2; i++){
             if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
     		int stPointer = i+1;
     		int endPointer = nums.length-1;
     		int target = -nums[i];    		
     		while(stPointer < endPointer){ 
     			int sum = nums[stPointer] + nums[endPointer];
     			if(sum == target){
     				res.add(Arrays.asList(nums[i], nums[stPointer],nums[endPointer]));
                     while (stPointer < endPointer && nums[stPointer] == nums[stPointer + 1]) stPointer++;  // skip same result
                     while (stPointer < endPointer && nums[endPointer] == nums[endPointer - 1]) endPointer--;
                     stPointer++;                  
     			} else if (sum > target){   				
     				endPointer--;
     			} else {
     				stPointer++; 
     			} 
     		}
     	}
     }
     	return res;       
    }

}
