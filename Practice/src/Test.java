import java.util.ArrayList;
import java.util.HashMap;


public class Test {
	
	public static void main(String[] args){
		   int[] arr1 = {1,2,10,20};
		   int[] arr2 = {3,7,10,20};
		   System.out.println(intersectionOfArray(arr1, arr2));
	}
	
	static Integer[] intersectionOfArray(int[] arr1, int[] arr2){
		   ArrayList<Integer> result = new ArrayList<Integer>();
		   HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		   for(int i = 0; i < arr1.length; i++){
		      if(hm.containsKey(arr1[i])){
		            hm.put(arr1[i], hm.get(arr1[i]) + 1);
		      }else {
		            hm.put(arr1[i], 1);
		            }
		   }
		   
		   for(int i=0; i < arr2.length; i++){
			   if(hm.containsKey(arr2[i])){
				   result.add(arr2[i]);
			   }
		   }
		   return result.toArray(new Integer[result.size()]);
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i < arr.length; i++ ){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
