package leetCodeAlgoEasy;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicateInArray {

	public static void main(String[] args) {
		int[] arr = {1,3,3,3,45,66,45,66,66,3};
		System.out.println(containsDuplicate(arr));
	}
	
    public static boolean containsDuplicate(int[] nums) {
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	for(int i = 0 ; i < nums.length; i++){
    		if(hm.containsKey(nums[i])){
    			hm.put(nums[i], hm.get(nums[i]) + 1);
    		}else {
    			hm.put(nums[i], 1);
    		}
    	}
    	System.out.println(hm);
    	for(Map.Entry entry : hm.entrySet() ){
    		if((int) entry.getValue() > 1 ){
    			return true ;
    		}
    	}
		return false;
        
    }

}
