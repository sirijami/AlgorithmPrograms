package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {1,25,100};
		int[] arr2 = {45,150,300};
		findMedianSortedArrays(arr1, arr2);

	}
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	double result = 0;
    	ArrayList<Integer> al = new ArrayList<Integer>();

    	for(int i = 0; i < nums1.length; i++){
    		al.add(nums1[i]);
    	}
    	for(int i = 0; i < nums2.length; i++){
    		al.add(nums2[i]);
    	}

    	Integer[] res = al.toArray(new Integer[al.size()]);
    	Arrays.sort(res);
    	printArray(res);
    	if(res.length % 2 == 0){
    		result = ((double)res[res.length/2] + (double)res[(res.length/2) -1])/2;    		
    	}else {
    		System.out.println(res.length/2);
    		result = res[res.length/2];
    	}
        System.out.println("result " + result);
        return result;
    }
	private static void printArray(Integer[] res) {
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}

}
