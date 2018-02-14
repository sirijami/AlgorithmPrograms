import java.util.HashMap;


public class findDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {2,5,3,23,5,3,67,8};
		findDuplicateAndDistnaceBetweenThem(arr);
	}
	
	private static int findDuplicateAndDistnaceBetweenThem(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++){
			if(hm.containsKey(arr[i])){
				System.out.println("The duplicate element is " + arr[i]);
				int diff = i - hm.get(arr[i]) - 1;
				System.out.println("The distance between the duplicate element is: " + diff);				
			}			
			hm.put(arr[i], i);
		}		
		return 0;		
	}



}
