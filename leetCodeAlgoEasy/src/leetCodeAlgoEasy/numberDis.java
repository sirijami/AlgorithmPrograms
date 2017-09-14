package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

// The solution is not of O(n) timecomplexity.
// TRy to solve in O(n) complexity
public class numberDis {

	public static void main(String[] args) {
		int[] array = {1,1};
		ArrayList<Integer> printResult = findDisappearedNumbers(array);
		System.out.println(Arrays.toString(printResult.toArray()));
	}
	
	public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i = 0 ; i < nums.length; i++){
			numberList.add(nums[i]);
		}
		
		Collections.sort(numberList);
		int largestNumber = numberList.size();

		for(int i = 1 ; i <= largestNumber; i++){
			if( !numberList.contains(i)){
				result.add(i);
			}			
		}
		
		return result;
	
	}

}
