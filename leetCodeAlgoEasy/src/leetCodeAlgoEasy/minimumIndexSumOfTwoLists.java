package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.HashMap;

public class minimumIndexSumOfTwoLists {

	public static void main(String[] args) {
		String[] list1 = {"k", "KFC"};
		String[] list2 = {"KFC", "k"};
		String[] result = findRestaurant(list1, list2);
		printStringArray(result);
	}
    private static void printStringArray(String[] andyList) {
		for(int i = 0 ; i < andyList.length;i++){
			System.out.print(andyList[i] + " ");
		}
		System.out.println();		
	}
	public static String[] findRestaurant(String[] list1, String[] list2) {
		int minIndex = Integer.MAX_VALUE; 
	       ArrayList<String> result = new ArrayList<String>();

			HashMap<String, Integer> hm = new HashMap<String, Integer>();
	        
			for(int i = 0 ; i < list2.length; i++){
				hm.put(list2[i], i);
			}
			System.out.println(hm);

			for(int i = 0 ; i < list1.length; i++){
				if(hm.containsKey(list1[i])){
	                int sum = i + hm.get(list1[i]);
	                System.out.println("sum " + sum);
	                if(sum < minIndex){
	                    minIndex = sum;
	                    result.clear();
	                    result.add(list1[i]); 
	                }else if( sum == minIndex){
	                	result.clear();
	                	return list1;
	                }

				}			
			}
			
			return result.toArray(new String[result.size()]);         
    }

}
