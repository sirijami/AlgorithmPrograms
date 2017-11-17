package leetCodeAlgoEasy;

public class sumOfTwo {

	public static void main(String[] args) {
		int[] arr = {2, 3,4};
		int target = 6;
		twoSum(arr, target);
	}
	
    private static int[] twoSum(int[] arr, int target) {
    	int[] result = new int[2];
    	int end = arr.length-1;
    	int start = 0;
    	while (start < end){
    		int sum =  arr[end] + arr[start];
            System.out.println(sum);
    		if(sum > target){
    			end --;
    		}else if( sum < target) {
    			start++;
    		}else {
    			result[0] = start +1;
    			result[1] = end + 1 ;
    			printArray(result);
    			return result;
    		}
    	}		
		return result;
	}

	private static void printArray(int[] result) {
    		for(int i = 0; i < result.length ; i++){
    			System.out.print(result[i] + " ");
    		}
    		System.out.println();		
	}
 //Time complexity of O(n2)   
//	public static int[] twoSum(int[] numbers, int target) {
//		int[] indexs = new int[2];
//        if (numbers == null || numbers.length < 2) return indexs;
//    	for(int i = 0 ; i < numbers.length; i++){
//    		int temp = target - numbers[i];
//    		for(int j = i+1 ; j < numbers.length ; j++){
//        		if(temp == numbers[j]){
//        			indexs[0] = i+1;
//        			indexs[1] = j+1;       			
//        		} 			
//    		}
//    	}
//    	
//		return indexs;       
//    }
    

}
