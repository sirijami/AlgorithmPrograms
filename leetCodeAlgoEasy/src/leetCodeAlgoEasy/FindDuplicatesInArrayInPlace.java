package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArrayInPlace {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		findDuplicates(nums);
	}
    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicateNumbersList = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
        	int index = Math.abs(nums[i]) - 1;
        	if(nums[index] < 0){
        		duplicateNumbersList.add(Math.abs(index + 1));
        	}else{
        		nums[index] = - nums[index];
        	}
        }
        System.out.println(duplicateNumbersList);
        return duplicateNumbersList;        
    }

}
