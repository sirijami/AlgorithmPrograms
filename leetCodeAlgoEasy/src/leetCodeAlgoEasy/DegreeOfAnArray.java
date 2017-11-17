package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,1};
		System.out.println(findShortestSubArray(arr));

	}
    public static int findShortestSubArray(int[] nums) {
    	int maxFreq = Integer.MIN_VALUE;
    	int number = 0;
    	int shortestSubArray = 0;
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	for(int i= 0; i < nums.length; i++){
    		if(hm.containsKey(nums[i])){
    			hm.put(nums[i], hm.get(nums[i]) +1);
    		}else {
    			hm.put(nums[i], 1);
    		}
    	}
    	for(Map.Entry<Integer, Integer> m : hm.entrySet()){
    		if(m.getValue() > maxFreq){
    			maxFreq = m.getValue();
    			number = m.getKey();
    		}
    	}
    	System.out.println(maxFreq);
    	System.out.println("number " + number);
    	
    	for(int i = 0 ; i < nums.length; i++){
    		if(nums[i] == number){
    			System.out.println("i " + i);
    			for(int j = nums.length-1; j >= 0 ; j--){
    				if(nums[j] == number){
    					System.out.println("j " + j);
    					shortestSubArray = j - i + 1 ;
    					return shortestSubArray;
    				}
    			}
    		}
    	}
		return 0;        
    }

}
