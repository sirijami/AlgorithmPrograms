package leetCodeAlgoEasy;

import java.util.Arrays;

public class EqualArrayElements {

	public static void main(String[] args) {
		int[] arr = {1,1,2147483647};
		System.out.println(minMoves(arr));
	}
	public static int minMoves(int[] nums) {
	    if (nums == null || nums.length == 0) return 0;
	    int minN = nums[0], res = 0;
	    for (int num : nums) minN = Math.min(minN, num);
	    for (int num : nums) res += (num-minN);
	    return res;
	}

}
