package leetCodeAlgoEasy;

public class moveZeroesInPlace {

	public static void main(String[] args) {
		int[] arr = {0,0,1,0,0,2,0,0};
		moveZeroes(arr);
		printArray(arr);

	}
    private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
	}
	public static void moveZeroes(int[] nums) {
    	int i = 0;
    	for(int j = 1 ; j < nums.length;) {
    		if(nums[i] == 0 && nums[j] != 0){
    			int temp = nums[i];
    			nums[i] = nums[j];
    			nums[j] = temp;
    			i++;
    		}else if(nums[i] == 0 && nums[j] == 0){
    			j++;
    		}else {
    			i++;
    			j++;
    		}
    		printArray(nums);
    	}
    		
    }


}
