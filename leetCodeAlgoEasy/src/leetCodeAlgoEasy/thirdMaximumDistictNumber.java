package leetCodeAlgoEasy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class thirdMaximumDistictNumber {

	public static void main(String[] args) {
		int[] arr = {1,2};
		System.out.println(thirdMax(arr));
	}
	
    public static int thirdMax(int[] nums) {
    	 int  res = 0,maxSoFar= 0;
    	   	
     	TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
     	for(int i = 0 ; i <= nums.length-1; i++){
     		if(tm.containsKey(nums[i])){
     			tm.put(nums[i], tm.get(nums[i]) + 1);
     		}else {
     			tm.put(nums[i],1);
     		}
     	}
     	System.out.println(tm);

     	if(tm.size() >= 3){
     		res = (int) tm.keySet().toArray()[tm.size()-3];
     		return res;
     	}
         
     	for(Map.Entry entry : tm.entrySet() ){
     		if((int) entry.getKey() > maxSoFar){
     			maxSoFar = (int) entry.getKey();
     		}   			
     	}
 		return maxSoFar;      		       
    }

}
