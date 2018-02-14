package leetCodeAlgoEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class minimumIndexSumOfTwoLists {

	public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		String[] result = findRestaurant(list1, list2);
		printStringArray(result);
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		String[] l1; String[] l2; String[] res = null;
		int temp = Integer.MAX_VALUE;
		String val = null;

		if(list1.length >= list2.length){
			l1 = list1.clone();
			l2 = list2.clone();
		}else {
			l1 = list2.clone();
			l2 = list1.clone();
		}
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		for(int i = 0; i < l1.length;i++){
			hm.put(l1[i], i);
		}
		System.out.println(hm);
		for(int i = 0; i < l2.length; i++){
			if(hm.containsKey(l2[i])){
				hm.put(l2[i], hm.get(l2[i]) + i);
			}
		}
		System.out.println("2");
		System.out.println(hm);
		
		/* find the minimum index value from the loop */
		for(Entry<String, Integer> e : hm.entrySet()){
			if(e.getValue() < temp){
				temp = e.getValue();
				val = e.getKey();				
			}
		}
		System.out.println("temp " + temp);
		System.out.println("val " + val);
		
		/*check whether any tie exists */
		for(Entry<String, Integer> e : hm.entrySet()){
			if(e.getValue() == temp && e.getKey() != val){
			     res = l1.clone() ;
			     printStringArray(res);
			     res = l2.clone(); 
			     return res;
			}
		}
		String[] valres = new String[]{val};

		return valres;      
    }
	
    private static void printStringArray(String[] andyList) {
		for(int i = 0 ; i < andyList.length;i++){
			System.out.print(andyList[i] + " ");
		}
		System.out.println();		
	}

}
