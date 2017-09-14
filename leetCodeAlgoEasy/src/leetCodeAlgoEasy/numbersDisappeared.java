package leetCodeAlgoEasy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class numbersDisappeared {

	public static void main(String[] args) {
		int[] array = {1,1};
		findDisappearedNumbers(array);
	}
	
    private static ArrayList<Integer> findDisappearedNumbers(int[] array) {
    	ArrayList<Integer> arrayToArrayList = new ArrayList<Integer>();
    	ArrayList<Integer> result = new ArrayList<Integer>();

    	for(int i = 0 ; i < array.length; i++){
    		arrayToArrayList.add(array[i]);
    	}
    	Collections.sort(arrayToArrayList);
    	System.out.println(Arrays.toString(arrayToArrayList.toArray()));
    	Integer[] arr = arrayToArrayList.toArray(new Integer[arrayToArrayList.size()]);
    	for(int i = 0; i < arr.length -1; i++){
    		int nextNum = arr[i+1];
    		if( nextNum != arr[i] && nextNum != arr[i] + 1){
    			int dif = nextNum - arr[i];
    			System.out.println(dif);
    			for(int j = 1; j <= dif-1 ; j++){
    				result.add(arr[i] + j);
    			}
    		}
    	}

    	System.out.println(Arrays.toString(result.toArray()));
  	
        return result;
		
	}
    
	



}
