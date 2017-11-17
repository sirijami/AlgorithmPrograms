package leetCodeAlgoEasy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*array with all as 0
if the element is in the list then change val to true(1)
retuen the indexes which has 1*/



public class numbersDissapearedInArray {

	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(arr));
	}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> ret = new ArrayList<Integer>();
	        
	        for(int i = 0; i < nums.length ; i++) {
	            int val = Math.abs(nums[i]) - 1;
	            if(nums[val] > 0) {
	                nums[val] = -nums[val];
	            }
	        }
	        for(int i = 0; i < nums.length; i++) {
	            if(nums[i] > 0) {
	                ret.add(i+1);
	            }
	        }
	        return ret;

	}


	private static void printArray(int[] r) {
		for(int i = 0;i < r.length; i++){
			System.out.print(r[i] +" ");
		}
		System.out.println();
		
	}


}
