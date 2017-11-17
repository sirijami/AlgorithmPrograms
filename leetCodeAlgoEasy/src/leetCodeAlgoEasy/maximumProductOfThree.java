package leetCodeAlgoEasy;

import java.security.acl.LastOwnerException;
import java.util.Arrays;

public class maximumProductOfThree {

	public static void main(String[] args) {
		int[] arr = {2,9,-3,5};
		System.out.println(maximumProduct(arr));
	}

	private static int maximumProduct(int[] arr) {
		int result = 0;
		Arrays.sort(arr);
		int firstThreeSum = arr[0] * arr[1] * arr[2];
		int lastThreeSum = arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
		if(arr.length >= 3){
			if(firstThreeSum < lastThreeSum){
				result = arr[arr.length -1] * arr[0] * arr[1];
				if(result > lastThreeSum){
					return result;
				}
			}else if( Math.abs(firstThreeSum) > Math.abs(lastThreeSum)){
				return firstThreeSum;
			}else {
				return lastThreeSum;
			}
		}
         return lastThreeSum;
	}
	


}
