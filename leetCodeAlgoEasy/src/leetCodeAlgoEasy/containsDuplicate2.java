package leetCodeAlgoEasy;

import java.util.Hashtable;

public class containsDuplicate2 {

	public static void main(String[] args) {
		int[] arr = {1,0,1,1};
	
		System.out.println(containsNearbyDuplicate(arr, 1));
		

	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		for(int i = 0 ; i < nums.length; i++){
			if(ht.containsKey(nums[i])){
				int firstIndex = ht.get(nums[i]);
				int diff = Math.abs(i - firstIndex);
				if(k >= diff){
					return true;
				}			
			}
			ht.put(nums[i], i);
		}
		System.out.println(ht);
		return false;
        
    }

}
