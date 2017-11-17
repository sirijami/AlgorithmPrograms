package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class intersection2 {

	public static void main(String[] args) {
		int[] array1 = {1};
		int[] array2 = {1,1};
		int[] res = intersection(array1,array2);
		printArray(res);
	}
	private static void printArray(int[] result) {
		for(int i = 0; i < result.length ; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();	
		
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> set = new ArrayList<Integer>();
        ArrayList<Integer> intersect = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }

}
