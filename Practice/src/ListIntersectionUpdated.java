import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class ListIntersectionUpdated {

	public static void main(String[] args) {
	      int[] list1 = {1};
	      int[] list2 = {1};
	      int[] output = intersect(list1, list2);
	      printArray(output);			
	}
	
	 private static void printArray(int[] output) {
		for(int i = 0; i < output.length; i++){
			System.out.print(output[i] + " ");
		}
		System.out.println();		
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> tempResult = new ArrayList<Integer>();
        int[] result = new int[tempResult.size()];
        printArray(result);
        if(nums1 == null && nums2 == null ){
            return result;
        }
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	    int[] numsOne;int count = 1; int[] numsTwo;

	        
	        if(nums1.length >= nums2.length){
	            numsOne = nums1.clone();
	            numsTwo = nums2.clone();
	            System.out.println("nums1 is longest");
	        }else{
	            numsOne = nums2.clone();
	            System.out.println("numsOne");
	            printArray(numsOne);
	            
	            System.out.println("numsTw0");
	            numsTwo = nums1.clone();
	            printArray(numsTwo);
	        }
	        
	        for(int i = 0 ; i < numsOne.length; i++){
	            if(hm.containsKey(numsOne[i])){
	                hm.put(numsOne[i], hm.get(numsOne[i]) + 1);
	            }else {
	                hm.put(numsOne[i], count);
	            }
	        }
	        System.out.println(hm);
	        for(int j = 0; j < numsTwo.length; j++){
	            if(hm.containsKey(numsTwo[j]) && hm.get(numsTwo[j]) > 0 ){
	                hm.put(numsTwo[j], hm.get(numsTwo[j]) - 1);
	                tempResult.add(numsTwo[j]);
	            }
	        }

	        for(int m = 0; m < tempResult.size(); m++){
	            result[m] = tempResult.get(m);
	        }
	        return result;
	    }

}
