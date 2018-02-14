import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class ListIntersection {

	public static void main(String[] args) {
	      int[] list1 = {21,47,80,4,3,24,87,12,22,11,48,6,89,80,74,71,74,55,58,56,4,98,40,66,
	    		  49,53,62,27,3,66,78,24,48,69,88,12,80,63,98,65,46,35,72,5,64,72,7,29,37,3,2,
	    		  75,44,93,79,78,13,39,85,26,15,41,87,47,29,93,41,74,6,48,17,89,27,61,2,68,99,
	    		  57,45,73,25,33,38,32,58};
	      int[] list2 = {1,39,6,81,85,10,38,22,0,89,57,93,58,69,65,80,84,24,27,54,37,36,26,88,
	    		  2,7,24,36,51,5,74,57,45,56,55,67,25,33,78,49,16,79,74,80,36,27,89,49,64,73,
	    		  96,60,92,31,98,72,22,31,0,93,70,87,80,66,75,69,81,52,94,90,51,90,74,36,58,38,
	    		  50,9,64,55,4,21,49,60,65,47,67,8,38,83};
	      System.out.println(findTheIntersection(list1, list2));	  
	}
	
	public static List<Integer> findTheIntersection(int[] list1, int[] list2){
	     ArrayList<Integer> result = new ArrayList<Integer>();
	     int count = 1;
	     HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	     for(int i = 0; i < list1.length; i++){
	           if(hm.containsKey(list1[i])) {
	                 hm.put(list1[i], count+1);
	           }else {
		           hm.put(list1[i] , count);
	           }

	     }
         System.out.println(hm);
	    for(int i = 0; i < list2.length; i++){
	          if(hm.containsKey(list2[i]) && hm.get(list2[i]) > 0){
	                result.add(list2[i]);
	                hm.put(list2[i], hm.get(list2[i]) - 1);
	          }
	    }
	    return result;
	}

}


