package leetCodeAlgoEasy;

import java.util.HashSet;
import java.util.Set;

public class intersection {

	public static void main(String[] args) {
		int[] array1 = {1,2,5,2,1};
		int[] array2 = {2,2,1,3};
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
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> intersect = new HashSet<Integer>();
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
