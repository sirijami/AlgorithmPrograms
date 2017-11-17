package leetCodeAlgoEasy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch {

	public static void main(String[] args) {
		int[] arr = {1,1};
		findErrorNums(arr);

	}
    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
        	if(hm.containsKey(nums[i])){
        		hm.put(nums[i], hm.get(nums[i]) + 1);
        	}else {
        		hm.put(nums[i], 1);
        	}
        }
        for(Map.Entry m : hm.entrySet() ){
        	if((int) m.getValue() > 1){
        		res[0] =  (int) m.getKey();
        	} 
        }
        for(int i = 1; i <= nums.length; i++){
        	if(! hm.containsKey(i)){
        		res[1] = i;
        	}
        }
        System.out.println(hm);
        printArray(res);
        return res;
        

    }
	private static void printArray(int[] res) {
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " ");
		}
		System.out.println();
		
	}

}
