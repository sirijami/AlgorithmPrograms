import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class DegreeOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,1,4};
		System.out.println(findShortestSubArray(arr));
	}
	 public static int findShortestSubArray(int[] nums) {
	        int count = 1;
	        int shortestLegnth = Integer.MAX_VALUE;
	        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	        for(int i = 0; i < nums.length ; i++){
	            if(hm.containsKey(nums[i])){
	                hm.put(nums[i], hm.get(nums[i]) + 1);
	            }else {
	                hm.put(nums[i], count);
	            }
	        }
	        System.out.println(hm);


	        ArrayList<Integer> al = new ArrayList<Integer>();
	       	        
	        Map.Entry<Integer, Integer> maxEntry = null;
	        int freq= 0;
	        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
	            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
	                maxEntry = entry;
	                freq = maxEntry.getValue();
	            }
	        }
	        
	        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
	            if(entry.getValue() == freq){
	                al.add(entry.getKey());
	            }
	        }
	        System.out.println(al);
	        
	        for(int i = 0; i < al.size(); i++){	        	
		        int startIndex = 0; int endIndex = 0;
		      
		        for(int a = 0; a < nums.length; a++){
		            if(nums[a] == al.get(i)){
		                startIndex = a;
		                break;
		            }
		        }
		        
		        for(int b = nums.length-1; b > 0; b--){
		            if(nums[b] == al.get(i)){
		                endIndex = b;
		                break;
		            }
		        }
		        
		        int dif = endIndex - startIndex + 1 ;
		        if(shortestLegnth > dif ){
		        	shortestLegnth = dif;
		        }
	        }
			return shortestLegnth;

	    }

}
